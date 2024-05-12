package Y;

import X.C145995oB;
import X.C16880lQ;
import X.C42299Git;
import X.C6YX;
import X.C76800UCe;
import X.C78685UuP;
import X.EnumC1289754j;
import X.FMX;
import X.H7R;
import X.InterfaceC153045zY;
import X.InterfaceC48038ItG;
import X.InterfaceC88472Yns;
import X.X1D;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS33S1200000_2 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object call$0(ACallableS33S1200000_2 aCallableS33S1200000_2) {
        int value;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", ((VideoPublishEditModel) aCallableS33S1200000_2.l1).getCreationId());
        c145995oB.LJI("shoot_way", ((VideoPublishEditModel) aCallableS33S1200000_2.l1).mShootWay);
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("content_source", H7R.LJIIIIZZ((VideoPublishEditModel) aCallableS33S1200000_2.l1));
        c145995oB.LJI("content_type", H7R.LJIIIZ((VideoPublishEditModel) aCallableS33S1200000_2.l1));
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCallableS33S1200000_2.l2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c145995oB);
        }
        if (C78685UuP.LJJJZ(((VideoPublishEditModel) aCallableS33S1200000_2.l1).getEditorProModel().getEditorProAnchorType())) {
            EnumC1289754j[] values = EnumC1289754j.values();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS33S1200000_2.l1;
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    EnumC1289754j enumC1289754j = values[i];
                    if (o.LJ(enumC1289754j.getType(), videoPublishEditModel.getEditorProModel().getEditorProAnchorType())) {
                        value = enumC1289754j.getValue();
                        break;
                    }
                    i++;
                } else {
                    value = EnumC1289754j.GENERAL.getValue();
                    break;
                }
            }
            c145995oB.LIZ(value, "ep_anchor_type");
        }
        FMX.LJIIL(aCallableS33S1200000_2.s0, c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS33S1200000_2 aCallableS33S1200000_2) {
        String str = aCallableS33S1200000_2.s0;
        Bitmap bitmap = (Bitmap) aCallableS33S1200000_2.l1;
        Runnable runnable = (Runnable) aCallableS33S1200000_2.l2;
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            C42299Git.LJFF(bitmap, new File(str), 60, Bitmap.CompressFormat.PNG);
        }
        if (runnable != null) {
            runnable.run();
            return null;
        }
        return null;
    }

    public static final Object call$2(ACallableS33S1200000_2 aCallableS33S1200000_2) {
        InterfaceC153045zY interfaceC153045zY;
        Bitmap LLJLL;
        C6YX c6yx = (C6YX) aCallableS33S1200000_2.l1;
        InterfaceC48038ItG interfaceC48038ItG = (InterfaceC48038ItG) aCallableS33S1200000_2.l2;
        String str = aCallableS33S1200000_2.s0;
        c6yx.getClass();
        try {
            interfaceC153045zY = c6yx.LJ;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MvChooseCoverBitmap getCurrDisplayImage exception");
            LIZ.append(e);
            c6yx.LIZJ(-500, X1D.LIZIZ(LIZ));
        }
        if (interfaceC153045zY != null) {
            int i = c6yx.LJIILJJIL;
            if (i == 0) {
                LLJLL = interfaceC153045zY.LLJL();
            } else {
                LLJLL = interfaceC153045zY.LLJLL(i);
            }
            if (LLJLL != null) {
                if (interfaceC48038ItG != null) {
                    try {
                        LLJLL = (Bitmap) interfaceC48038ItG.apply(LLJLL);
                    } catch (Exception e2) {
                        c6yx.LIZJ(-700, "MvChooseCoverBitmap onCoverSeekDone converter error");
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                System.currentTimeMillis();
                if (!C42299Git.LJFF(LLJLL, new File(str), 60, Bitmap.CompressFormat.PNG)) {
                    c6yx.LIZJ(-600, "MvChooseCoverBitmap onCoverSeekDone saveImageBitmap error");
                }
                C42299Git.LJ(LLJLL);
                return null;
            }
        }
        c6yx.LIZJ(-500, "MvChooseCoverBitmap getCurrDisplayImage return null");
        return null;
    }

    public ACallableS33S1200000_2(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
