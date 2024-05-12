package com.ss.android.ugc.aweme.video.simcommon;

import X.C36922EeM;
import X.C46291IEt;
import X.C51680KQa;
import X.C51682KQc;
import X.InterfaceC46856IaC;
import X.KQQ;
import X.KQS;
import X.KQU;
import X.KQW;
import X.KQY;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;

/* loaded from: classes9.dex */
public class SimRadarTransmitter implements IRadarTransmitter {
    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ boolean analyzerEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ boolean localTraceEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ int networkQualityType() {
        return -2;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void startVideo(String str) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void tag(String str) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ InterfaceC46856IaC tracer() {
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void transmitE(String str, String str2, Exception exc) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void transmitI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public /* bridge */ /* synthetic */ void transmitW(String str, String str2) {
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean aLogWriteFuncAddrEnabled() {
        return ((Boolean) KQW.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean enabled() {
        return ((Boolean) C46291IEt.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public int kernelLogLever() {
        return ((Number) KQY.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public int kernelLogLeverPrecise() {
        return ((Number) KQU.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public int logNotifyLevel() {
        return ((Number) C51680KQa.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean remoteTransmitEnabled() {
        return ((Boolean) KQQ.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean sdkTransmitEnabled() {
        return ((Boolean) C51682KQc.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public boolean ttSDKALogOptEnabled() {
        return ((Boolean) KQS.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.playerkit.radar.IRadarTransmitter
    public long getALogSimpleWriteFuncAddr() {
        return ALog.getALogSimpleWriteFuncAddr();
    }

    public void transmitI(String str) {
        C36922EeM.LJ(str);
    }

    public void transmitE(String str, Exception exc) {
        C36922EeM.LIZIZ(exc, str);
    }
}
