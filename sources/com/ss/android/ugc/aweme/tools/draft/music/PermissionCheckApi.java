package com.ss.android.ugc.aweme.tools.draft.music;

import X.C169126kO;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PermissionCheckApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface CheckPermissionRequest {
        @E8L("/tiktok/v1/permission/check/")
        InterfaceC37276Ek4<PermissionCheckResponse> checkPermission(@InterfaceC64986Pew("check_entities") C169126kO c169126kO);
    }

    /* loaded from: classes3.dex */
    public static final class PermissionCheckEntity implements Serializable {

        @InterfaceC65349Pkn("check_type")
        public int checkType;

        @InterfaceC65349Pkn("id")
        public String id = "";

        @InterfaceC65349Pkn("id_type")
        public int idType;

        public final int getCheckType() {
            return this.checkType;
        }

        public final String getId() {
            return this.id;
        }

        public final int getIdType() {
            return this.idType;
        }

        public final void setCheckType(int i) {
            this.checkType = i;
        }

        public final void setId(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.id = str;
        }

        public final void setIdType(int i) {
            this.idType = i;
        }
    }
}
