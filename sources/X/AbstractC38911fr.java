package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import java.io.UnsupportedEncodingException;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38911fr implements InterfaceC83927Wwl, TO7, C6GI, InterfaceC31104CIq {
    public static C65387PlP LJLIL;

    @Override // X.InterfaceC83927Wwl
    public boolean F() {
        return false;
    }

    public abstract InterfaceC71722SCw LJIIL(Object obj);

    public abstract List LJIILJJIL(Context context);

    public abstract AbstractC234519Ih LJIILL();

    public abstract boolean LJIILLIIL();

    public abstract Keva LJIIZILJ();

    @Override // X.InterfaceC83927Wwl
    public int LJIJ() {
        return 0;
    }

    public abstract AbstractC234519Ih LJIJJ();

    public abstract String LJIJJLI();

    public int LJIL(int i, CharSequence oldText, CharSequence newText) {
        o.LJIIIZ(oldText, "oldText");
        o.LJIIIZ(newText, "newText");
        return -1;
    }

    public abstract void LJJ(PXH pxh, int i, String str);

    public void LJJI(PXH pxh, int i, String str) {
    }

    public abstract void LJJIFFI(String str, long j, Exception exc, Integer num);

    public abstract void LJJII(long j, String str);

    public abstract void LJJIII();

    @Override // X.InterfaceC83927Wwl
    public boolean LJJIIJ() {
        return false;
    }

    public void LJJIIJZLJL() {
    }

    public abstract void LJJIIZ(C76881UFh c76881UFh);

    public abstract void LJJIIZI();

    public abstract void LJJIJ(PXX pxx, Throwable th, C64598PWw c64598PWw);

    public abstract void LJJIJIIJI(PXH pxh, String str);

    public abstract void LJJIJIIJIL(PXH pxh, C64537PUn c64537PUn);

    public abstract void LJJIJIL(PXH pxh, C64598PWw c64598PWw);

    public abstract void LJJIJL(int i);

    public abstract void LJJIJLIJ(String str, String str2);

    public abstract void LJJIL(Object obj);

    public abstract void LJJIZ(Object obj);

    public abstract void LJJJ(Context context, String str, Bundle bundle);

    @Override // X.InterfaceC83927Wwl
    public boolean LJJJJZ() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public int LJJJLIIL() {
        return 0;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LJJZ() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LJLIIL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LJLJJL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LJLJL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLII() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLIILII() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLJJIJIL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLJJJJJIL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLJJL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public int LLJLILLLLZIIL() {
        return 5;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public long LLLI() {
        return 0L;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLLIIL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLLIZZ() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLLLLZL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLLZL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean LLZZZIL() {
        return false;
    }

    @Override // X.InterfaceC83927Wwl
    public boolean t() {
        return false;
    }

    public static void LJIJI() {
        synchronized (AbstractC38911fr.class) {
            C35191Zr.LIZIZ().getClass();
        }
    }

    @Override // X.InterfaceC83927Wwl
    public InterfaceC79152V4q LJJJJIZL() {
        return new C78915Uy7();
    }

    @Override // X.InterfaceC83927Wwl
    public InterfaceC83883Ww3 LLLLZI() {
        return new C74347TFv();
    }

    @Override // X.InterfaceC83927Wwl
    public InterfaceC83958WxG LLZLLLL() {
        return new HVH();
    }

    @Override // X.InterfaceC83927Wwl
    public OSZ h() {
        return new OSZ(576, 1024);
    }

    @Override // X.InterfaceC83927Wwl
    public InterfaceC65784Pro LLJL() {
        return C56622Kc.LJLIL;
    }

    @Override // X.InterfaceC83927Wwl
    public InterfaceC65784Pro LLZILL() {
        return C56612Kb.LJLIL;
    }

    public static C66108Px2 LJIILIIL(String str, String str2) {
        try {
            return new C66108Px2(str2, str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.TO7
    public void LJII(int i, Object key) {
        o.LJIIIZ(key, "key");
    }

    @Override // X.TO7
    public void LJIIJJI(Object key, Object result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
    }

    @Override // X.TO7
    public void LIZ(Object obj, Object result, Object info, long j) {
        C45454Hsg key = (C45454Hsg) obj;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        o.LJIIIZ(info, "info");
        LJJII(j, key.LJLIL);
    }

    @Override // X.TO7
    public void LIZIZ(Object obj, Exception exc, Object info, long j) {
        C45454Hsg key = (C45454Hsg) obj;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        LJJIFFI(key.LJLIL, j, null, null);
    }
}
