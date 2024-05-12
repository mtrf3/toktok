package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.CameraIconResponseBody;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.2xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75382xa implements InterfaceC72972th {
    public static final C75382xa LJLIL = new C75382xa();
    public static final XJO LJLILLLLZI;
    public static CopyOnWriteArraySet<String> LJLJI;

    @Override // X.InterfaceC72972th
    public final InterfaceC59692Vx LIZ() {
        return null;
    }

    static {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.2xd
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 1 || i == 3) {
                        C75382xa.LJLJI = null;
                    }
                }
            }
        });
        LJLILLLLZI = XJR.LIZ();
    }

    @Override // X.InterfaceC72972th
    public final int LJ() {
        return EnumC72992tj.CONVERSATION_PROPERTY_TYPES_CAMERA_ICON.getValue();
    }

    @Override // X.InterfaceC72972th
    public final Object LIZJ() {
        o.LJIIIIZZ(C105004Ae.LIZ(), "kevaRepo");
        C62822Ol8 c62822Ol8 = C75362xY.LIZ;
        Keva kevaRepo = (Keva) c62822Ol8.getValue();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("last_time_to_send_request");
        LIZ.append(curUserId);
        long j = kevaRepo.getLong(X1D.LIZIZ(LIZ), -1L);
        C105004Ae.LIZJ();
        if (NetworkService.LJI().LIZ() - j >= 86400000) {
            C105004Ae.LIZJ();
            long LIZ2 = NetworkService.LJI().LIZ();
            Keva kevaRepo2 = (Keva) c62822Ol8.getValue();
            o.LJIIIIZZ(kevaRepo2, "kevaRepo");
            String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId2, "userService().curUserId");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("last_time_to_send_request");
            LIZ3.append(curUserId2);
            kevaRepo2.storeLong(X1D.LIZIZ(LIZ3), LIZ2);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC72972th
    public final C76800UCe LIZLLL() {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC72972th
    public final Object LIZIZ(TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        CameraIconResponseBody cameraIconResponseBody;
        List<Long> list;
        if (C96573qf.LIZIZ() == 7) {
            return C76800UCe.LIZ;
        }
        if (tiktokV1ImInboxDataGetResponse == null || (cameraIconResponseBody = tiktokV1ImInboxDataGetResponse.cameraIcon) == null) {
            return C76800UCe.LIZ;
        }
        List<Long> list2 = cameraIconResponseBody.uids;
        if (list2 != null) {
            list = ORZ.LLJILJILJ(list2);
        } else {
            list = null;
        }
        Object LJII = LJII(list, interfaceC67352kd);
        if (LJII == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJII;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d A[Catch: all -> 0x017e, TryCatch #0 {all -> 0x017e, blocks: (B:27:0x0129, B:29:0x012d, B:39:0x0131), top: B:26:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #0 {all -> 0x017e, blocks: (B:27:0x0129, B:29:0x012d, B:39:0x0131), top: B:26:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List<java.lang.Long> r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75382xa.LJII(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Long] */
    public static void LJI(String str, String str2, InterfaceC88471Ynr interfaceC88471Ynr) {
        if (TextUtils.isEmpty(str) && (TextUtils.isEmpty(str2) || o.LJ(str2, "-1"))) {
            return;
        }
        if (str2 == 0) {
            str2 = Long.valueOf(C81273Gx.LIZLLL(str));
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = LJLJI;
        if (copyOnWriteArraySet != null) {
            if (copyOnWriteArraySet.contains(str2.toString()) && interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Boolean.FALSE, str);
                return;
            }
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C66142ig(interfaceC88471Ynr, str2, str, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:19:0x0097, B:23:0x009b, B:25:0x00a3, B:26:0x00a7, B:28:0x00b2, B:33:0x00ca, B:11:0x0075, B:13:0x0079, B:15:0x007f), top: B:10:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:19:0x0097, B:23:0x009b, B:25:0x00a3, B:26:0x00a7, B:28:0x00b2, B:33:0x00ca, B:11:0x0075, B:13:0x0079, B:15:0x007f), top: B:10:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:19:0x0097, B:23:0x009b, B:25:0x00a3, B:26:0x00a7, B:28:0x00b2, B:33:0x00ca, B:11:0x0075, B:13:0x0079, B:15:0x007f), top: B:10:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:19:0x0097, B:23:0x009b, B:25:0x00a3, B:26:0x00a7, B:28:0x00b2, B:33:0x00ca, B:11:0x0075, B:13:0x0079, B:15:0x007f), top: B:10:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC88471Ynr<? super java.lang.Boolean, ? super java.lang.String, X.C76800UCe> r10, java.lang.String r11, java.lang.String r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75382xa.LJFF(X.Ynr, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
