package com.bytedance.pitaya.api.bean;

import X.VF7;
import com.bytedance.pitaya.api.PTYCustomURLHost;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYPackageFilterCallback;
import com.bytedance.pitaya.api.PTYPyBinderCallback;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PTYSetupInfo implements ReflectionCall {
    public String aid;
    public String appVersion;
    public boolean autoRequestUpdate;
    public String channel;
    public PTYCustomURLHost customURLHost;
    public PTYDIDCallback didCallback;
    public int downloadConcurrency;
    public boolean flEnable;
    public boolean idleDownloadEnable;
    public boolean isDebugMode;
    public boolean isLowStorage;
    public List<String> moduleList;
    public PTYPackageFilterCallback packageFilterCallback;
    public String pluginVersion;
    public PTYPyBinderCallback pyBinder;
    public int pyConcurrency;
    public PTYSettingsCallback settingsCallback;
    public PTYSetupMode setupMode;
    public PTYUIDCallback uidCallback;

    public PTYSetupInfo() {
        this(new VF7());
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final boolean getAutoRequestUpdate() {
        return this.autoRequestUpdate;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final PTYCustomURLHost getCustomURLHost() {
        return this.customURLHost;
    }

    public final PTYDIDCallback getDidCallback() {
        return this.didCallback;
    }

    public final int getDownloadConcurrency() {
        return this.downloadConcurrency;
    }

    public final boolean getFlEnable() {
        return this.flEnable;
    }

    public final boolean getIdleDownloadEnable() {
        return this.idleDownloadEnable;
    }

    public final List<String> getModuleList() {
        return this.moduleList;
    }

    public final PTYPackageFilterCallback getPackageFilterCallback() {
        return this.packageFilterCallback;
    }

    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    public final PTYPyBinderCallback getPyBinder() {
        return this.pyBinder;
    }

    public final int getPyConcurrency() {
        return this.pyConcurrency;
    }

    public final PTYSettingsCallback getSettingsCallback() {
        return this.settingsCallback;
    }

    public final PTYSetupMode getSetupMode() {
        return this.setupMode;
    }

    public final PTYUIDCallback getUidCallback() {
        return this.uidCallback;
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public final boolean isLowStorage() {
        return this.isLowStorage;
    }

    public PTYSetupInfo(VF7 vf7) {
        this.aid = "";
        this.appVersion = "";
        this.channel = "";
        this.downloadConcurrency = 2;
        this.autoRequestUpdate = true;
        this.pyConcurrency = 2;
        this.setupMode = PTYSetupMode.Normal;
        this.aid = vf7.LIZ;
        this.appVersion = vf7.LIZIZ;
        this.channel = vf7.LIZJ;
        this.didCallback = vf7.LIZLLL;
        this.uidCallback = vf7.LJ;
        this.packageFilterCallback = null;
        this.settingsCallback = null;
        this.downloadConcurrency = vf7.LJFF;
        this.autoRequestUpdate = vf7.LJI;
        this.idleDownloadEnable = false;
        this.pluginVersion = null;
        this.pyConcurrency = vf7.LJII;
        this.pyBinder = null;
        this.flEnable = false;
        this.isDebugMode = false;
        this.customURLHost = null;
        this.moduleList = null;
        this.setupMode = vf7.LJIIIIZZ;
        this.isLowStorage = false;
    }

    public final void setAid(String str) {
        o.LJIIJ(str, "<set-?>");
        this.aid = str;
    }

    public final void setAppVersion(String str) {
        o.LJIIJ(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setAutoRequestUpdate(boolean z) {
        this.autoRequestUpdate = z;
    }

    public final void setChannel(String str) {
        o.LJIIJ(str, "<set-?>");
        this.channel = str;
    }

    public final void setCustomURLHost(PTYCustomURLHost pTYCustomURLHost) {
        this.customURLHost = pTYCustomURLHost;
    }

    public final void setDebugMode(boolean z) {
        this.isDebugMode = z;
    }

    public final void setDidCallback(PTYDIDCallback pTYDIDCallback) {
        this.didCallback = pTYDIDCallback;
    }

    public final void setDownloadConcurrency(int i) {
        this.downloadConcurrency = i;
    }

    public final void setFlEnable(boolean z) {
        this.flEnable = z;
    }

    public final void setIdleDownloadEnable(boolean z) {
        this.idleDownloadEnable = z;
    }

    public final void setLowStorage(boolean z) {
        this.isLowStorage = z;
    }

    public final void setModuleList(List<String> list) {
        this.moduleList = list;
    }

    public final void setPackageFilterCallback(PTYPackageFilterCallback pTYPackageFilterCallback) {
        this.packageFilterCallback = pTYPackageFilterCallback;
    }

    public final void setPluginVersion(String str) {
        this.pluginVersion = str;
    }

    public final void setPyBinder(PTYPyBinderCallback pTYPyBinderCallback) {
        this.pyBinder = pTYPyBinderCallback;
    }

    public final void setPyConcurrency(int i) {
        this.pyConcurrency = i;
    }

    public final void setSettingsCallback(PTYSettingsCallback pTYSettingsCallback) {
        this.settingsCallback = pTYSettingsCallback;
    }

    public final void setSetupMode(PTYSetupMode pTYSetupMode) {
        o.LJIIJ(pTYSetupMode, "<set-?>");
        this.setupMode = pTYSetupMode;
    }

    public final void setUidCallback(PTYUIDCallback pTYUIDCallback) {
        this.uidCallback = pTYUIDCallback;
    }

    public /* synthetic */ PTYSetupInfo(VF7 vf7, DefaultConstructorMarker defaultConstructorMarker) {
        this(vf7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PTYSetupInfo(String aid, String appVersion, String channel, PTYDIDCallback pTYDIDCallback, PTYUIDCallback pTYUIDCallback, PTYPackageFilterCallback pTYPackageFilterCallback, PTYSettingsCallback pTYSettingsCallback, int i, boolean z, String str, int i2, PTYPyBinderCallback pTYPyBinderCallback, boolean z2, boolean z3, PTYCustomURLHost pTYCustomURLHost) {
        this(new VF7());
        o.LJIIJ(aid, "aid");
        o.LJIIJ(appVersion, "appVersion");
        o.LJIIJ(channel, "channel");
        this.aid = aid;
        this.appVersion = appVersion;
        this.channel = channel;
        this.didCallback = pTYDIDCallback;
        this.uidCallback = pTYUIDCallback;
        this.packageFilterCallback = pTYPackageFilterCallback;
        this.settingsCallback = pTYSettingsCallback;
        this.downloadConcurrency = i;
        this.autoRequestUpdate = z;
        this.pluginVersion = str;
        this.pyConcurrency = i2;
        this.pyBinder = pTYPyBinderCallback;
        this.flEnable = z2;
        this.isDebugMode = z3;
        this.customURLHost = pTYCustomURLHost;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PTYSetupInfo(String aid, String appVersion, String channel, PTYDIDCallback pTYDIDCallback, PTYUIDCallback pTYUIDCallback, PTYPackageFilterCallback pTYPackageFilterCallback, PTYSettingsCallback pTYSettingsCallback, int i, boolean z, boolean z2, String str, int i2, PTYPyBinderCallback pTYPyBinderCallback, boolean z3, boolean z4, PTYCustomURLHost pTYCustomURLHost) {
        this(new VF7());
        o.LJIIJ(aid, "aid");
        o.LJIIJ(appVersion, "appVersion");
        o.LJIIJ(channel, "channel");
        this.aid = aid;
        this.appVersion = appVersion;
        this.channel = channel;
        this.didCallback = pTYDIDCallback;
        this.uidCallback = pTYUIDCallback;
        this.packageFilterCallback = pTYPackageFilterCallback;
        this.settingsCallback = pTYSettingsCallback;
        this.downloadConcurrency = i;
        this.autoRequestUpdate = z;
        this.idleDownloadEnable = z2;
        this.pluginVersion = str;
        this.pyConcurrency = i2;
        this.pyBinder = pTYPyBinderCallback;
        this.flEnable = z3;
        this.isDebugMode = z4;
        this.customURLHost = pTYCustomURLHost;
    }

    public /* synthetic */ PTYSetupInfo(String str, String str2, String str3, PTYDIDCallback pTYDIDCallback, PTYUIDCallback pTYUIDCallback, PTYPackageFilterCallback pTYPackageFilterCallback, PTYSettingsCallback pTYSettingsCallback, int i, boolean z, String str4, int i2, PTYPyBinderCallback pTYPyBinderCallback, boolean z2, boolean z3, PTYCustomURLHost pTYCustomURLHost, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : pTYDIDCallback, (i3 & 16) != 0 ? null : pTYUIDCallback, (i3 & 32) != 0 ? null : pTYPackageFilterCallback, (i3 & 64) != 0 ? null : pTYSettingsCallback, (i3 & 128) != 0 ? 2 : i, (i3 & 256) != 0 ? true : z, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? 2 : i2, (i3 & 2048) != 0 ? null : pTYPyBinderCallback, (i3 & 4096) != 0 ? false : z2, (i3 & FileUtils.BUFFER_SIZE) != 0 ? false : z3, (i3 & 16384) == 0 ? pTYCustomURLHost : null);
    }

    public /* synthetic */ PTYSetupInfo(String str, String str2, String str3, PTYDIDCallback pTYDIDCallback, PTYUIDCallback pTYUIDCallback, PTYPackageFilterCallback pTYPackageFilterCallback, PTYSettingsCallback pTYSettingsCallback, int i, boolean z, boolean z2, String str4, int i2, PTYPyBinderCallback pTYPyBinderCallback, boolean z3, boolean z4, PTYCustomURLHost pTYCustomURLHost, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : pTYDIDCallback, (i3 & 16) != 0 ? null : pTYUIDCallback, (i3 & 32) != 0 ? null : pTYPackageFilterCallback, (i3 & 64) != 0 ? null : pTYSettingsCallback, (i3 & 128) != 0 ? 2 : i, (i3 & 256) != 0 ? true : z, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? null : str4, (i3 & 2048) != 0 ? 2 : i2, (i3 & 4096) != 0 ? null : pTYPyBinderCallback, (i3 & FileUtils.BUFFER_SIZE) != 0 ? false : z3, (i3 & 16384) != 0 ? false : z4, (i3 & 32768) == 0 ? pTYCustomURLHost : null);
    }
}
