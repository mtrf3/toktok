package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public class ServerHosts {
    public static final Companion Companion = new Companion();
    public final String kauth = "kauth.kakao.com";
    public final String kapi = "kapi.kakao.com";
    public final String account = "accounts.kakao.com";
    public final String mobileAccount = "auth.kakao.com";
    public final String sharer = "sharer.kakao.com";
    public final String navi = "kakaonavi-wguide.kakao.com";
    public final String channel = "pf.kakao.com";

    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public String getAccount() {
        return this.account;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getKapi() {
        return this.kapi;
    }

    public String getKauth() {
        return this.kauth;
    }

    public String getMobileAccount() {
        return this.mobileAccount;
    }

    public String getNavi() {
        return this.navi;
    }

    public String getSharer() {
        return this.sharer;
    }
}
