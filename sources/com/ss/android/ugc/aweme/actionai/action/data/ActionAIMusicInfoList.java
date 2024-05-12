package com.ss.android.ugc.aweme.actionai.action.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.actionai.net.ServerMonitorInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAIMusicInfoList {

    @InterfaceC65349Pkn("music_info_list")
    public final List<Music> musicInfoList;

    @InterfaceC65349Pkn("monitor_info")
    public final ServerMonitorInfo serverMonitorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionAIMusicInfoList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionAIMusicInfoList copy$default(ActionAIMusicInfoList actionAIMusicInfoList, List list, ServerMonitorInfo serverMonitorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = actionAIMusicInfoList.musicInfoList;
        }
        if ((i & 2) != 0) {
            serverMonitorInfo = actionAIMusicInfoList.serverMonitorInfo;
        }
        return actionAIMusicInfoList.copy(list, serverMonitorInfo);
    }

    public final ActionAIMusicInfoList copy(List<? extends Music> musicInfoList, ServerMonitorInfo serverMonitorInfo) {
        o.LJIIIZ(musicInfoList, "musicInfoList");
        return new ActionAIMusicInfoList(musicInfoList, serverMonitorInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionAIMusicInfoList)) {
            return false;
        }
        ActionAIMusicInfoList actionAIMusicInfoList = (ActionAIMusicInfoList) obj;
        return o.LJ(this.musicInfoList, actionAIMusicInfoList.musicInfoList) && o.LJ(this.serverMonitorInfo, actionAIMusicInfoList.serverMonitorInfo);
    }

    public int hashCode() {
        int hashCode = this.musicInfoList.hashCode() * 31;
        ServerMonitorInfo serverMonitorInfo = this.serverMonitorInfo;
        return hashCode + (serverMonitorInfo == null ? 0 : serverMonitorInfo.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionAIMusicInfoList(musicInfoList=");
        LIZ.append(this.musicInfoList);
        LIZ.append(", serverMonitorInfo=");
        LIZ.append(this.serverMonitorInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<Music> getMusicInfoList() {
        return this.musicInfoList;
    }

    public final ServerMonitorInfo getServerMonitorInfo() {
        return this.serverMonitorInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionAIMusicInfoList(List<? extends Music> musicInfoList, ServerMonitorInfo serverMonitorInfo) {
        o.LJIIIZ(musicInfoList, "musicInfoList");
        this.musicInfoList = musicInfoList;
        this.serverMonitorInfo = serverMonitorInfo;
    }

    public /* synthetic */ ActionAIMusicInfoList(List list, ServerMonitorInfo serverMonitorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : serverMonitorInfo);
    }
}
