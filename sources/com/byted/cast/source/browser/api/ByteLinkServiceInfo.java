package com.byted.cast.source.browser.api;

import X.X1D;

/* loaded from: classes29.dex */
public class ByteLinkServiceInfo {
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public int i;
    public String j;
    public boolean k;
    public boolean l;
    public String m;

    /* renamed from: n, reason: collision with root package name */
    public String f114n;
    public String o;
    public String p;

    public ByteLinkServiceInfo(String str, int i, String str2, boolean z) {
        this.d = -1;
        this.e = -1;
        this.f = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
        this.a = str;
        this.c = i;
        this.j = str2;
        this.k = z;
    }

    public ByteLinkServiceInfo(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, boolean z) {
        this.i = 0;
        this.l = false;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = str3;
        this.j = str4;
        this.k = z;
    }

    public ByteLinkServiceInfo(String str, String str2, String str3, String str4) {
        this.d = -1;
        this.e = -1;
        this.f = 0;
        this.g = 0;
        this.i = 0;
        this.j = "";
        this.k = false;
        this.l = false;
        this.m = str;
        this.f114n = str2;
        this.o = str3;
        this.p = str4;
    }

    public int getCaptureType() {
        return this.i;
    }

    public String getConnectId() {
        return this.j;
    }

    public String getDeviceID() {
        return this.h;
    }

    public int getFeatures() {
        return this.g;
    }

    public int getFps() {
        return this.f;
    }

    public int getHeight() {
        return this.e;
    }

    public String getIp() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public int getPort() {
        return this.c;
    }

    public int getWidth() {
        return this.d;
    }

    public String get_RtcAppId() {
        return this.m;
    }

    public boolean get_RtcLink() {
        return this.l;
    }

    public String get_RtcRoomId() {
        return this.o;
    }

    public String get_RtcToken() {
        return this.f114n;
    }

    public String get_RtcUserId() {
        return this.p;
    }

    public boolean isConnectByUser() {
        return this.k;
    }

    public void setCaptureType(int i) {
        this.i = i;
    }

    public void setDeviceID(String str) {
        this.h = str;
    }

    public void setFeatures(int i) {
        this.g = i;
    }

    public void setFps(int i) {
        this.f = i;
    }

    public void setHeight(int i) {
        this.e = i;
    }

    public void setIp(String str) {
        this.a = str;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setPort(int i) {
        this.c = i;
    }

    public void setWidth(int i) {
        this.d = i;
    }

    public void set_RtcAppId(String str) {
        this.m = str;
    }

    public void set_RtcLink(boolean z) {
        this.l = z;
    }

    public void set_RtcRoomId(String str) {
        this.o = str;
    }

    public void set_RtcToken(String str) {
        this.f114n = str;
    }

    public void set_RtcUserId(String str) {
        this.p = str;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ip:");
        LIZ.append("xxx.xxx.xxx.xxx");
        LIZ.append(" port:");
        LIZ.append(this.c);
        LIZ.append(" width:");
        LIZ.append(this.d);
        LIZ.append(" height:");
        LIZ.append(this.e);
        LIZ.append(" fps:");
        LIZ.append(this.f);
        LIZ.append(" features:");
        LIZ.append(this.g);
        LIZ.append(" deviceID:");
        LIZ.append(this.h);
        LIZ.append(" rtc_link:");
        LIZ.append(this.l);
        LIZ.append(" rtc_appId:");
        LIZ.append(this.m);
        LIZ.append(" rtc_token:");
        LIZ.append(this.f114n);
        LIZ.append(" rtc_roomId:");
        LIZ.append(this.o);
        LIZ.append(" rtc_userId:");
        LIZ.append(this.p);
        return X1D.LIZIZ(LIZ);
    }
}
