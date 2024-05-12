package Y;

import X.AbstractC36786EcA;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C268513p;
import X.C76800UCe;
import X.InterfaceC40525FvN;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS172S0100000_6;

/* loaded from: classes7.dex */
public class ACallableS55S0300000_6 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS55S0300000_6 aCallableS55S0300000_6) {
        AbstractC36786EcA abstractC36786EcA = (AbstractC36786EcA) aCallableS55S0300000_6.l0;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) aCallableS55S0300000_6.l1;
        IESSettingsProxy iESSettingsProxy = (IESSettingsProxy) aCallableS55S0300000_6.l2;
        abstractC36786EcA.getClass();
        abstractC36786EcA.LJLIL = SettingsRequestServiceImpl.LJIILLIIL().LJI(editor, iESSettingsProxy);
        return null;
    }

    public static final Object call$1(ACallableS55S0300000_6 aCallableS55S0300000_6) {
        InterfaceC40525FvN interfaceC40525FvN = (InterfaceC40525FvN) ((AqS172S0100000_6) ((ACallableS83S0200000_6) aCallableS55S0300000_6.l2).l0).l0;
        if (interfaceC40525FvN != null) {
            interfaceC40525FvN.LIZ((byte[]) aCallableS55S0300000_6.l0);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$2(ACallableS55S0300000_6 aCallableS55S0300000_6) {
        try {
            ParcelFileDescriptor openFileDescriptor = ((Context) aCallableS55S0300000_6.l0).getContentResolver().openFileDescriptor((Uri) aCallableS55S0300000_6.l1, "w");
            File file = (File) aCallableS55S0300000_6.l2;
            if (openFileDescriptor != null) {
                try {
                    C268513p.LIZ(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                } finally {
                }
            }
            AnonymousClass636.LJFF(openFileDescriptor, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS55S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
