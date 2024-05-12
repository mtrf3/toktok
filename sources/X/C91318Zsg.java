package X;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Zsg, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91318Zsg {
    public static final C0M6<String, C91316Zse> LIZ = new C0M6<>(10);
    public static final java.util.Map<String, T0J<C91316Zse>> LIZIZ = Collections.synchronizedMap(new C1HQ());

    static {
        String path = LIZ();
        o.LJIIIZ(path, "path");
        try {
            C37247Ejb.LIZIZ.getClass();
            C36871EdX.LJ(path);
        } catch (Throwable unused) {
        }
    }

    public static String LIZ() {
        File LLIIJI;
        StringBuilder LIZ2 = X1D.LIZ();
        Context context = C39579Fg7.LJLIL;
        if (Environment.isExternalStorageEmulated()) {
            LLIIJI = C16880lQ.LLIIJLIL(context);
        } else {
            LLIIJI = C16880lQ.LLIIJI(context, null);
            if (LLIIJI != null) {
                C39579Fg7.LJFF(LLIIJI);
            } else {
                LLIIJI = C16880lQ.LLIIJLIL(context);
            }
        }
        LIZ2.append(LLIIJI.getPath());
        String str = File.separator;
        LIZ2.append(str);
        LIZ2.append("music_dsp");
        LIZ2.append(str);
        LIZ2.append("lyric");
        return X1D.LIZIZ(LIZ2);
    }

    public static C91316Zse LIZIZ(C91316Zse c91316Zse, Music music) {
        float previewStartTime;
        if (music == null) {
            return c91316Zse;
        }
        if (music.getPreviewEndTime() > 0.0f) {
            previewStartTime = music.getPreviewEndTime();
        } else {
            previewStartTime = music.getPreviewStartTime() + music.getDuration();
        }
        float f = 1000;
        long j = previewStartTime * f;
        ArrayList<C91319Zsh> arrayList = c91316Zse.LIZJ;
        ArrayList<C91319Zsh> arrayList2 = new ArrayList<>();
        Iterator<C91319Zsh> it = arrayList.iterator();
        while (it.hasNext()) {
            C91319Zsh next = it.next();
            C91319Zsh c91319Zsh = next;
            if (!TextUtils.isEmpty(c91319Zsh.LIZ)) {
                long j2 = c91319Zsh.LIZIZ;
                if (j2 >= 0 && j2 <= j) {
                    arrayList2.add(next);
                }
            }
        }
        c91316Zse.LIZJ = arrayList2;
        long previewStartTime2 = music.getPreviewStartTime() * f;
        ArrayList<C91319Zsh> arrayList3 = c91316Zse.LIZJ;
        int size = arrayList3.size();
        Iterator<C91319Zsh> it2 = arrayList3.iterator();
        int i = 0;
        while (it2.hasNext()) {
            C91319Zsh next2 = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                C91319Zsh c91319Zsh2 = next2;
                c91319Zsh2.LIZIZ -= previewStartTime2;
                if (i >= size - 1) {
                    c91319Zsh2.LIZJ = Long.MAX_VALUE;
                } else {
                    c91319Zsh2.LIZJ = ((C91319Zsh) ListProtector.get(arrayList3, i2)).LIZIZ - previewStartTime2;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        ArrayList<C91319Zsh> arrayList4 = new ArrayList<>();
        Iterator<C91319Zsh> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C91319Zsh next3 = it3.next();
            if (next3.LIZJ > 0) {
                arrayList4.add(next3);
            }
        }
        c91316Zse.LIZJ = arrayList4;
        return c91316Zse;
    }
}
