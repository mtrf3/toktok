package X;

import Y.ARunnableS14S0201000_11;
import Y.AUListenerS93S0200000_1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173216qz implements InterfaceC173286r6 {
    public static String LJLIL = "";
    public static String LJLILLLLZI = "";
    public static String LJLJI = "";
    public static long LJLJJI;

    public static final ArrayList LJI(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CutSameMediaItem cutSameMediaItem = (CutSameMediaItem) it.next();
            CutSameMediaItemCrop cutSameMediaItemCrop = cutSameMediaItem.crop;
            ItemCrop itemCrop = new ItemCrop(cutSameMediaItemCrop.upperLeftX, cutSameMediaItemCrop.upperLeftY, cutSameMediaItemCrop.lowerRightX, cutSameMediaItemCrop.lowerRightY);
            String str = cutSameMediaItem.materialId;
            long j = cutSameMediaItem.targetStartTime;
            boolean z = cutSameMediaItem.isMutable;
            String str2 = cutSameMediaItem.alignMode;
            boolean z2 = cutSameMediaItem.isSubVideo;
            boolean z3 = cutSameMediaItem.isReverse;
            int i = cutSameMediaItem.cartoonType;
            int i2 = cutSameMediaItem.width;
            int i3 = cutSameMediaItem.height;
            long j2 = cutSameMediaItem.duration;
            String str3 = cutSameMediaItem.source;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            long j3 = cutSameMediaItem.sourceStartTime;
            float f = cutSameMediaItem.cropScale;
            String str5 = cutSameMediaItem.type;
            String str6 = cutSameMediaItem.mediaSrc;
            String str7 = cutSameMediaItem.gamePlayAlgorithm;
            if (str7 != null) {
                str4 = str7;
            }
            arrayList.add(new MediaItem(str, j, cutSameMediaItem.targetEndTime, z, str2, z2, z3, i, str4, cutSameMediaItem.volume, i2, i3, j2, str3, j3, f, itemCrop, str5, str6, 0.0f, 524288));
        }
        return arrayList;
    }

    public static final int LIZJ(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static final boolean LIZLLL(ResourceItem resourceItem, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(resourceItem, "<this>");
        boolean LJ = o.LJ(resourceItem.getName(), activityC45651qj.getString(R.string.q5l));
        boolean LJ2 = o.LJ(resourceItem.getIcon(), "");
        boolean LJ3 = o.LJ(resourceItem.getPath(), "");
        if (LJ && LJ2 && LJ3) {
            return true;
        }
        return false;
    }

    public static final void LJ(final ValueAnimator valueAnimator, final String scene, final boolean z) {
        o.LJIIIZ(scene, "scene");
        final C76732zl c76732zl = new C76732zl();
        c76732zl.element = 0;
        final C72242sW c72242sW = new C72242sW();
        c72242sW.element = -1L;
        final C72242sW c72242sW2 = new C72242sW();
        c72242sW2.element = -1L;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.6r1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                super.onAnimationEnd(animation);
                C76732zl c76732zl2 = c76732zl;
                c76732zl2.element--;
                float nanoTime = ((float) (System.nanoTime() - c72242sW2.element)) / 1.0E9f;
                int i = c76732zl.element;
                WPZ.LIZIZ.LIZJ(scene, i / nanoTime, nanoTime, i, z);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
                super.onAnimationStart(animation);
                c76732zl.element = 0;
                c72242sW.element = valueAnimator.getDuration();
            }
        });
        valueAnimator.addUpdateListener(new AUListenerS93S0200000_1(c72242sW2, c76732zl, 7));
    }

    public static String LJFF(Context context, String str, boolean z) {
        InputStream fileInputStream;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                try {
                    if (z) {
                        fileInputStream = context.getAssets().open(str);
                    } else {
                        fileInputStream = new FileInputStream(str);
                    }
                    inputStream = fileInputStream;
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    inputStream.close();
                } catch (Exception e) {
                    C77117UOj.LJIIZILJ(e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        C77117UOj.LJIIZILJ(e2);
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            C77117UOj.LJIIZILJ(e3);
        }
        return byteArrayOutputStream.toString();
    }

    @Override // X.InterfaceC173286r6
    public void LJIILLIIL(boolean z, C67233Qa5 c67233Qa5, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        if (z) {
            FMX.LJIIL("push_withdraw_success", C67233Qa5.LIZ(c67233Qa5));
        }
    }

    public static String LIZ(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(LJLIL)) {
            if (TextUtils.isEmpty(str)) {
                LJLIL = LJFF(context, "webview_monitor_js_file_v2/slardar_sdk.js", true);
            } else {
                LJLIL = LJFF(context, str, false);
            }
        }
        if (TextUtils.isEmpty(LJLILLLLZI)) {
            LJLILLLLZI = LJFF(context, "webview_monitor_js_file_v2/slardar_bridge.js", true);
        }
        LJLJI = str2;
        if (str2 == null) {
            str2 = "";
        }
        LJLJI = str2;
        if (!z) {
            LJLIL = "";
            LJLJI = "";
            LJLILLLLZI = "";
        }
        StringBuilder LIZJ = b1.LIZJ(" javascript:( ", " function(){ ");
        LIZJ.append(LJLIL);
        LIZJ.append(LJLILLLLZI);
        return C025908h.LIZIZ(LIZJ, LJLJI, " } ", " )() ", LIZJ);
    }

    @Override // X.InterfaceC173286r6
    public void LIZIZ(Context context, C67230Qa2 c67230Qa2, List list, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        C67231Qa3.LIZ(this, context, c67230Qa2, list, aRunnableS14S0201000_11);
    }
}
