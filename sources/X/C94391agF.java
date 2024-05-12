package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* renamed from: X.agF, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94391agF implements InterfaceC93555aSl {
    public InterfaceC93554aSk LIZ;

    @Override // X.InterfaceC93555aSl
    public final void stop() {
    }

    static {
        C16880lQ.LJLLJ(C94391agF.class);
    }

    @Override // X.InterfaceC93555aSl
    public final void LIZ(C94128ac0 c94128ac0) {
        this.LIZ = c94128ac0;
    }

    @Override // X.InterfaceC93555aSl
    public final boolean LIZIZ(Activity activity, AuthorizationRequest authorizationRequest) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse("https://play.google.com/store/apps/details?id=com.spotify.music"));
        intent.setPackage("com.android.vending");
        ComponentName resolveActivity = intent.resolveActivity(activity.getPackageManager());
        InterfaceC93554aSk interfaceC93554aSk = this.LIZ;
        if (resolveActivity == null) {
            if (interfaceC93554aSk != null) {
                ClassNotFoundException classNotFoundException = new ClassNotFoundException("Couldn't find an activity to handle a play store link");
                C94128ac0 c94128ac0 = (C94128ac0) interfaceC93554aSk;
                C93551aSh c93551aSh = new C93551aSh();
                c93551aSh.LIZ = EnumC93552aSi.ERROR;
                c93551aSh.LJ = classNotFoundException.getMessage();
                c94128ac0.LIZIZ.LIZ(c94128ac0.LIZ, c93551aSh.LIZ());
                return false;
            }
            return false;
        }
        C16880lQ.LIZIZ(activity, intent);
        if (interfaceC93554aSk != null) {
            C94128ac0 c94128ac02 = (C94128ac0) interfaceC93554aSk;
            C93551aSh c93551aSh2 = new C93551aSh();
            c93551aSh2.LIZ = EnumC93552aSi.EMPTY;
            c94128ac02.LIZIZ.LIZ(c94128ac02.LIZ, c93551aSh2.LIZ());
            return true;
        }
        return true;
    }
}
