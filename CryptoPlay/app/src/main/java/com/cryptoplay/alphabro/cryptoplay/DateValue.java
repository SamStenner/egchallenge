package com.cryptoplay.alphabro.cryptoplay;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by android on 10/03/18.
 */

public class DateValue {

    private Date date;
    private float open, close, low, high;
    private long volume, marketCap;

    public DateValue(Date date, float open, float high, float low, float close, long vloume, long marketCap) {
        this.date = date;
        this.open = open;
        this.close = close;
        this.low = low;
        this.high = high;
        this.marketCap = marketCap;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }
}
