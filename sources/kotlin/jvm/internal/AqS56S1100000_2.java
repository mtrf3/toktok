package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C121574pt;
import X.C122034qd;
import X.C149355tb;
import X.C151425ww;
import X.C151445wy;
import X.C151535x7;
import X.C165236e7;
import X.C16880lQ;
import X.C223738qH;
import X.C5KN;
import X.C5MG;
import X.C5QF;
import X.C5QO;
import X.C67102kE;
import X.C68322mC;
import X.C6DL;
import X.C6DQ;
import X.C6MP;
import X.C76800UCe;
import X.C82105WKf;
import X.EnumC121534pp;
import X.InterfaceC149745uE;
import X.InterfaceC88472Yns;
import X.KL2;
import X.OSJ;
import X.S3I;
import X.W5F;
import X.W5U;
import Y.ACListenerS22S0100000_2;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.vesdk.VEEditor;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class AqS56S1100000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        S3I s3i = new S3I();
        s3i.LIZ = true;
        LJIIIIZZ.LJIJJLI = s3i.LIZ();
        LJIIIIZZ.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "imageView.layoutParams");
        layoutParams.height = (int) KL2.LIZJ(((C6DL) this.l1).LIZ, 24.0f);
        layoutParams.width = (int) KL2.LIZJ(((C6DL) this.l1).LIZ, 24.0f);
        imageView.setLayoutParams(layoutParams);
    }

    public static final Object invoke$0(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        C121574pt LIZIZ;
        C122034qd editorPro = (C122034qd) obj;
        o.LJIIIZ(editorPro, "editorPro");
        if (!TextUtils.isEmpty(((C5MG) aqS56S1100000_2.l1).LJJIII) && (LIZIZ = editorPro.LJ().LIZIZ()) != null) {
            String str = ((C5MG) aqS56S1100000_2.l1).LJJIII;
            o.LJI(str);
            LIZIZ.LIZ(str);
        }
        C121574pt c121574pt = new C121574pt(EnumC121534pp.COLOR);
        String str2 = aqS56S1100000_2.s0;
        o.LJI(str2);
        c121574pt.LIZJ(str2, "", null);
        editorPro.LJ().LJJIIJZLJL(c121574pt);
        ((C5MG) aqS56S1100000_2.l1).LJJIII = aqS56S1100000_2.s0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        int intValue = ((Number) obj).intValue();
        InterfaceC149745uE interfaceC149745uE = (InterfaceC149745uE) aqS56S1100000_2.l1;
        if (interfaceC149745uE != null) {
            interfaceC149745uE.LIZ(intValue, aqS56S1100000_2.s0);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r12 > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS56S1100000_2 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS56S1100000_2.invoke$2(kotlin.jvm.internal.AqS56S1100000_2, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        C82105WKf setState = (C82105WKf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82105WKf.LIZ(setState, false, null, null, null, new C08630Vn(new C165236e7((C6MP) aqS56S1100000_2.l1, aqS56S1100000_2.s0, null)), null, null, 3967);
    }

    public static final Object invoke$4(AqS56S1100000_2 aqS56S1100000_2, Object it) {
        o.LJIIIZ(it, "it");
        System.currentTimeMillis();
        String path = C151445wy.LIZIZ((CreativeInfo) aqS56S1100000_2.l1, true).getPath();
        C151535x7 c151535x7 = C151535x7.LIZ;
        String str = aqS56S1100000_2.s0;
        c151535x7.getClass();
        C151425ww.LIZIZ = new OSJ<>(aqS56S1100000_2.s0, new File(path, C151535x7.LIZLLL(str)).getPath(), new WeakReference(it));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AqS56S1100000_2 aqS56S1100000_2, Object it) {
        C67102kE c67102kE;
        o.LJIIIZ(it, "it");
        ((C68322mC) aqS56S1100000_2.l1).element = it;
        String str = aqS56S1100000_2.s0;
        if (str != null && str.length() != 0 && (c67102kE = (C67102kE) ((LinkedHashMap) C5KN.LIZ).get(str)) != null) {
            c67102kE.LIZIZ = (VEEditor) ((C68322mC) aqS56S1100000_2.l1).element;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        C5QF setState = (C5QF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5QF.LIZ(setState, null, null, null, null, null, null, null, ((C5QO) aqS56S1100000_2.l1).LJJLJ().LIZIZ.get(aqS56S1100000_2.s0), null, 383);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        aqS56S1100000_2.invoke$0((ImageView) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        String str;
        MentionStruct mentionInfo;
        C6DL actions = (C6DL) obj;
        o.LJIIIZ(actions, "$this$actions");
        C6DQ c6dq = new C6DQ();
        InteractStickerStruct interactStickerStruct = ((C223738qH) aqS56S1100000_2.l1).LJLJLLL;
        if (interactStickerStruct == null || (mentionInfo = interactStickerStruct.getMentionInfo()) == null || (str = mentionInfo.getNickname()) == null) {
            str = "";
        }
        c6dq.LIZJ = str;
        c6dq.LIZ = new AqS56S1100000_2(aqS56S1100000_2.s0, actions, 7);
        c6dq.LIZLLL = new ACListenerS22S0100000_2((C223738qH) aqS56S1100000_2.l1, 165);
        actions.LIZ(c6dq);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS56S1100000_2 aqS56S1100000_2, Object obj) {
        OnSpeechToSongPrepareListener.DefaultImpls.onPreparing$default((OnSpeechToSongPrepareListener) aqS56S1100000_2.l1, aqS56S1100000_2.s0, ((Number) obj).intValue(), false, 4, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(C5MG c5mg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c5mg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(C5QO c5qo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c5qo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(C149355tb c149355tb, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c149355tb;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(InterfaceC149745uE interfaceC149745uE, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC149745uE;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(C6MP c6mp, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c6mp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(C223738qH c223738qH, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c223738qH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(CreativeInfo creativeInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = creativeInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = onSpeechToSongPrepareListener;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(String str, C68322mC c68322mC, int i) {
        super(1);
        this.$t = i;
        this.l1 = c68322mC;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S1100000_2(String str, C6DL c6dl, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c6dl;
    }
}
