package X;

import Y.AfS7S2000000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.UEj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76857UEj implements InterfaceC48038ItG, InterfaceC139755e7, IIsTagNeedUpdatedListener, InterfaceC76502U0s {
    public static final C76857UEj LJLIL = new C76857UEj();
    public static final C76857UEj LJLILLLLZI = new C76857UEj();

    public void LJIIIIZZ() {
    }

    public void LJIIIZ(Animatable anim) {
        o.LJIIIZ(anim, "anim");
    }

    public void LJIIJ() {
    }

    public void LJIIJJI(Animatable anim) {
        o.LJIIIZ(anim, "anim");
    }

    public void LJIIL(int i) {
        throw null;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public void onTagNeedNotUpdate() {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public void onTagNeedUpdate() {
    }

    public static String LIZJ(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String LJ(String str) {
        File file = new File(str);
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return LIZJ(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC76502U0s
    public void LIZ(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC139755e7
    public OSZ LIZIZ(Bitmap bitmap) {
        return new GYB(false).LIZIZ(bitmap);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        return response.data;
    }

    public static String LIZLLL(Context context, android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = openInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    openInputStream.close();
                    return LIZJ(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final C73641SvF LJI(AbstractC73638SvC abstractC73638SvC, String str) {
        o.LJIIIZ(abstractC73638SvC, "<this>");
        return abstractC73638SvC.LJIILIIL(new AfS7S2000000_13(str, 4)).LJIIJ(new AfS7S2000000_13(str, 5));
    }

    public static final C73641SvF LJII(AbstractC73638SvC abstractC73638SvC, String str) {
        o.LJIIIZ(abstractC73638SvC, "<this>");
        return abstractC73638SvC.LJIILIIL(new AfS7S2000000_13(str, 6)).LJIIJ(new AfS7S2000000_13(str, 3));
    }

    public static final boolean LJIILIIL(java.util.Set set1, java.util.Set set2) {
        o.LJIIIZ(set1, "set1");
        o.LJIIIZ(set2, "set2");
        if (set1.size() != set2.size()) {
            return false;
        }
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            if (!set2.contains(it.next())) {
                return false;
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (!set1.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static final void LJFF(Activity activity, String str, InterfaceC76859UEl interfaceC76859UEl) {
        o.LJIIIZ(activity, "activity");
        H78.LIZ("LoginHelper -> mobLoginNotify");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("enter_method", "click_save_draft_popup");
        FMX.LJIIL("login_notify", c145995oB.LIZ);
        C60903NvH.LJIIJJI().getAccountService().LIZ(activity, str, "click_save_draft_popup", null, new C76858UEk(interfaceC76859UEl));
    }
}
