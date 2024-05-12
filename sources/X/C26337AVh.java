package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import kotlin.jvm.internal.o;

/* renamed from: X.AVh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26337AVh<T> implements InterfaceC86003Zc {
    public static final C26337AVh<T> LJLIL = new C26337AVh<>();

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Boolean> interfaceC73573Su9) {
        boolean booleanValue;
        boolean z = false;
        RCN.LIZLLL = false;
        RCN.LJ = false;
        String LJIILL = AccountService.LJIJ().LJIILL();
        StringBuilder LIZ = X1D.LIZ();
        UserPermissionData.UserPermissionRequestType userPermissionRequestType = UserPermissionData.UserPermissionRequestType.COLLECTION_POPUP;
        LIZ.append(userPermissionRequestType);
        LIZ.append(',');
        UserPermissionData.UserPermissionRequestType userPermissionRequestType2 = UserPermissionData.UserPermissionRequestType.COLLECTION_CHECKBOX;
        LIZ.append(userPermissionRequestType2);
        UserPermissionData.UserPermissionInfo queryUserPermission = ((RBX) HG3.LJIILL()).queryUserPermission(LJIILL, X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(queryUserPermission, OHQ.LIZ);
        Boolean bool = queryUserPermission.permissionsMap().get(userPermissionRequestType.toString());
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        RCN.LIZLLL = booleanValue;
        Boolean bool2 = queryUserPermission.permissionsMap().get(userPermissionRequestType2.toString());
        if (bool2 != null) {
            z = bool2.booleanValue();
        }
        RCN.LJ = z;
        if (RCN.LIZLLL) {
            interfaceC73573Su9.onNext(Boolean.TRUE);
            interfaceC73573Su9.onComplete();
        } else {
            interfaceC73573Su9.onError(new IllegalStateException("region or age check failed"));
        }
    }
}
