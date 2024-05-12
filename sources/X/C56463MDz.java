package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MDz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56463MDz implements InterfaceC62545Ogf, ME0 {
    public static long LJ(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += LJ(file2.getAbsolutePath());
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
                    return 0L;
                } catch (StackOverflowError e2) {
                    e2.printStackTrace();
                    return 0L;
                }
            }
        }
        return length;
    }

    public static void LJI(File file) {
        File[] listFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            if (listFiles.length == 0) {
                C16880lQ.LLLZZIL(file);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LJI(file2);
                } else {
                    C16880lQ.LLLZZIL(file2);
                }
            }
            C16880lQ.LLLZZIL(file);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC62545Ogf
    public void LIZ(Object obj) {
        if (obj instanceof G27) {
            C9XU.LIZLLL((G27) obj);
        }
    }

    @Override // X.InterfaceC62545Ogf
    public void LIZJ(Object obj) {
        C57082Lw.LIZ.LIZJ("key_need_hide_pop_window").postValue(obj);
    }

    @Override // X.InterfaceC62545Ogf
    public C53955LFn LIZIZ(int i, InterfaceC65784Pro interfaceC65784Pro) {
        C53955LFn c53955LFn = new C53955LFn(interfaceC65784Pro);
        C9XU.LIZ(i, c53955LFn);
        return c53955LFn;
    }

    @Override // X.ME0
    public void LIZLLL(C81534VzG c81534VzG, EnumC79770VSk networkState, HashMap detailMap, JSONObject jSONObject) {
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(detailMap, "detailMap");
        if (networkState == EnumC79770VSk.NO_NETWORK && c81534VzG.LIZIZ) {
            C1DH.LJJIJIIJI(new Runnable() { // from class: X.2LK
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                        c5s1.LIZJ(R.string.tg1);
                        c5s1.LJ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        try {
            FUA.LIZJ("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJII(C56448MDk c56448MDk, ViewGroup viewGroup, View view, ImageView imageView, boolean z) {
        ActivityC45651qj activityC45651qj;
        boolean z2;
        int LIZJ = (int) KL2.LIZJ(c56448MDk.getContext(), 28.0f);
        Context context = c56448MDk.getContext();
        float f = C61447O9r.LJIIJJI;
        int LIZJ2 = (int) (KL2.LIZJ(context, f) - ((LIZJ - c56448MDk.getProgressHeight()) / 2));
        Context context2 = c56448MDk.getContext();
        o.LJIIIIZZ(context2, "seekBar.context");
        if (z) {
            LFH.LIZIZ.LIZLLL().LJIIZILJ();
            if (LEZ.LIZ.LIZ() && (context2 instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) context2) != null) {
                LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(activityC45651qj).Xm0();
                if (Xm0 != null) {
                    z2 = Xm0.LJIILLIIL();
                } else {
                    z2 = true;
                }
                if (C53946LFe.LIZJ(context2, null).LJFF || (!z2)) {
                    LFH.LIZIZ.LIZLLL().LJIIZILJ();
                    LIZJ2 = Math.max(0, LIZJ2 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LEZ.LIZLLL()))));
                }
            }
        }
        C54840Lfg.LJLIL(c56448MDk, LIZJ, -1, LIZJ2, 8388691);
        if (!C91L.LIZ()) {
            C54840Lfg.LJLIL(viewGroup, -2, -1, (int) KL2.LIZJ(c56448MDk.getContext(), f), 8388691);
        } else {
            C45804HyK.LJJL((int) KL2.LIZJ(c56448MDk.getContext(), f), viewGroup);
        }
        C54840Lfg.LJLIL(view, (int) KL2.LIZJ(c56448MDk.getContext(), 99.0f), -1, (int) KL2.LIZJ(c56448MDk.getContext(), f), 80);
        if (imageView != null) {
            C54840Lfg.LJLIL(imageView, -2, -1, ((int) (KL2.LIZJ(c56448MDk.getContext(), 60.0f) + KL2.LIZJ(c56448MDk.getContext(), f))) + ((int) KL2.LIZJ(c56448MDk.getContext(), 44.0f)), 81);
        }
    }
}
