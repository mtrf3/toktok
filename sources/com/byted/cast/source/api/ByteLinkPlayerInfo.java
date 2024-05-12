package com.byted.cast.source.api;

import java.util.Map;

/* loaded from: classes29.dex */
public class ByteLinkPlayerInfo {
    public int a = 100;
    public int b = 0;
    public int c = 200;
    public int d = 303;
    public int e = 60;
    public int f = 0;
    public int g = 1;
    public int h = 0;
    public int i = 3;
    public int j = 0;
    public int k = 3;
    public Map<String, Integer> l;

    public static int getCastModeMirror() {
        return 100;
    }

    public int getAudioSource() {
        return this.k;
    }

    public int getAudioTransProto() {
        return this.j;
    }

    public int getBitRateLevel() {
        return this.d;
    }

    public int getCaptureType() {
        return this.g;
    }

    public int getCodecId() {
        return this.b;
    }

    public int getFps() {
        return this.e;
    }

    public Map<String, Integer> getMeidaFormat() {
        return this.l;
    }

    public int getProjectMode() {
        return this.a;
    }

    public int getResolutionLevel() {
        return this.c;
    }

    public int getStreamType() {
        return this.f;
    }

    public int getVideoSourceType() {
        return this.h;
    }

    public int getVideoTransProto() {
        return this.i;
    }

    public void setAudioSource(int i) {
        this.k = i;
    }

    public void setAudioTransProto(int i) {
        this.j = i;
    }

    public void setBitRateLevel(int i) {
        this.d = i;
    }

    public void setCaptureType(int i) {
        this.g = i;
    }

    public void setCodecId(int i) {
        this.b = i;
    }

    public void setFps(int i) {
        this.e = i;
    }

    public void setMediaFormat(Map<String, Integer> map) {
        this.l = map;
    }

    public void setProjectMode(int i) {
        this.a = i;
    }

    public void setResolutionLevel(int i) {
        this.c = i;
    }

    public void setStreamType(int i) {
        this.f = i;
    }

    public void setVideoSourceType(int i) {
        this.h = i;
    }

    public void setVideoTransProto(int i) {
        this.i = i;
    }
}
