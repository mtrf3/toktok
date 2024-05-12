package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import com.google.gson.m;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecImpressRequest {

    @InterfaceC65349Pkn("feed_list")
    public final List<RecImpressItem> feedList;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("session_info")
    public final RecSessionInfo sessionInfo;

    @InterfaceC65349Pkn("sub_scene")
    public final String subScene;

    /* JADX WARN: Multi-variable type inference failed */
    public RecImpressRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecImpressRequest copy$default(RecImpressRequest recImpressRequest, String str, String str2, List list, RecSessionInfo recSessionInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recImpressRequest.scene;
        }
        if ((i & 2) != 0) {
            str2 = recImpressRequest.subScene;
        }
        if ((i & 4) != 0) {
            list = recImpressRequest.feedList;
        }
        if ((i & 8) != 0) {
            recSessionInfo = recImpressRequest.sessionInfo;
        }
        return recImpressRequest.copy(str, str2, list, recSessionInfo);
    }

    public final RecImpressRequest copy(String str, String str2, List<RecImpressItem> list, RecSessionInfo recSessionInfo) {
        return new RecImpressRequest(str, str2, list, recSessionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecImpressRequest)) {
            return false;
        }
        RecImpressRequest recImpressRequest = (RecImpressRequest) obj;
        return o.LJ(this.scene, recImpressRequest.scene) && o.LJ(this.subScene, recImpressRequest.subScene) && o.LJ(this.feedList, recImpressRequest.feedList) && o.LJ(this.sessionInfo, recImpressRequest.sessionInfo);
    }

    public int hashCode() {
        String str = this.scene;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subScene;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RecImpressItem> list = this.feedList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RecSessionInfo recSessionInfo = this.sessionInfo;
        return hashCode3 + (recSessionInfo != null ? recSessionInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecImpressRequest(scene=");
        LIZ.append(this.scene);
        LIZ.append(", subScene=");
        LIZ.append(this.subScene);
        LIZ.append(", feedList=");
        LIZ.append(this.feedList);
        LIZ.append(", sessionInfo=");
        LIZ.append(this.sessionInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public static final class RecSessionInfo {

        @InterfaceC65349Pkn("session_id")
        public final String sessionId;

        /* JADX WARN: Multi-variable type inference failed */
        public RecSessionInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RecSessionInfo copy$default(RecSessionInfo recSessionInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recSessionInfo.sessionId;
            }
            return recSessionInfo.copy(str);
        }

        public final RecSessionInfo copy(String str) {
            return new RecSessionInfo(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecSessionInfo) && o.LJ(this.sessionId, ((RecSessionInfo) obj).sessionId);
        }

        public int hashCode() {
            String str = this.sessionId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RecSessionInfo(sessionId=");
            return q.LIZIZ(LIZ, this.sessionId, ')', LIZ);
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public RecSessionInfo(String str) {
            this.sessionId = str;
        }

        public /* synthetic */ RecSessionInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class RecImpressItem {

        @InterfaceC65349Pkn("id")
        public final String id;

        @InterfaceC65349Pkn("impression_info")
        public final m impressionInfo;

        @InterfaceC65349Pkn("type")
        public final Integer type;

        /* JADX WARN: Multi-variable type inference failed */
        public RecImpressItem() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RecImpressItem copy$default(RecImpressItem recImpressItem, String str, Integer num, m mVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recImpressItem.id;
            }
            if ((i & 2) != 0) {
                num = recImpressItem.type;
            }
            if ((i & 4) != 0) {
                mVar = recImpressItem.impressionInfo;
            }
            return recImpressItem.copy(str, num, mVar);
        }

        public final RecImpressItem copy(String str, Integer num, m mVar) {
            return new RecImpressItem(str, num, mVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecImpressItem)) {
                return false;
            }
            RecImpressItem recImpressItem = (RecImpressItem) obj;
            return o.LJ(this.id, recImpressItem.id) && o.LJ(this.type, recImpressItem.type) && o.LJ(this.impressionInfo, recImpressItem.impressionInfo);
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.type;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            m mVar = this.impressionInfo;
            return hashCode2 + (mVar != null ? mVar.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RecImpressItem(id=");
            LIZ.append(this.id);
            LIZ.append(", type=");
            LIZ.append(this.type);
            LIZ.append(", impressionInfo=");
            LIZ.append(this.impressionInfo);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final String getId() {
            return this.id;
        }

        public final m getImpressionInfo() {
            return this.impressionInfo;
        }

        public final Integer getType() {
            return this.type;
        }

        public RecImpressItem(String str, Integer num, m mVar) {
            this.id = str;
            this.type = num;
            this.impressionInfo = mVar;
        }

        public /* synthetic */ RecImpressItem(String str, Integer num, m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? null : mVar);
        }
    }

    public final List<RecImpressItem> getFeedList() {
        return this.feedList;
    }

    public final String getScene() {
        return this.scene;
    }

    public final RecSessionInfo getSessionInfo() {
        return this.sessionInfo;
    }

    public final String getSubScene() {
        return this.subScene;
    }

    public RecImpressRequest(String str, String str2, List<RecImpressItem> list, RecSessionInfo recSessionInfo) {
        this.scene = str;
        this.subScene = str2;
        this.feedList = list;
        this.sessionInfo = recSessionInfo;
    }

    public /* synthetic */ RecImpressRequest(String str, String str2, List list, RecSessionInfo recSessionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : recSessionInfo);
    }
}
