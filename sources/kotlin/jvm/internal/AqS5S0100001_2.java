package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C131555Eh;
import X.C52V;
import X.C63144OqK;
import X.C6GJ;
import X.C6GQ;
import X.C6M6;
import X.C6MT;
import X.C78688UuS;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public class AqS5S0100001_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f1;
    public Object l0;

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
            case 10:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public final C6GQ invoke$0(C6GQ setState) {
        o.LJIIIZ(setState, "$this$setState");
        if (this.f1 <= 0.105f) {
            String string = C78688UuS.LJIJJ((C6GJ) this.l0).getString(R.string.tlt);
            o.LJIIIIZZ(string, "activity.getString(R.str…e_stillPicSelected_label)");
            return C6GQ.L(setState, string, false, false, 6);
        }
        ((C6GJ) this.l0).LLIFFJFJJ().videoTimeTrimData.isSingleFrame = false;
        String string2 = C78688UuS.LJJIII((C6GJ) this.l0).getString(R.string.dyv, C63144OqK.LIZIZ(new Object[]{Float.valueOf(this.f1)}, 1, Locale.getDefault(), "%.1f", "format(locale, format, *args)"));
        o.LJIIIIZZ(string2, "context.getString(R.stri…Default(), \"%.1f\", time))");
        return C6GQ.L(setState, string2, false, false, 6);
    }

    public static final Object invoke$0(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        EmbedHashTagStickerModel setState = (EmbedHashTagStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EmbedHashTagStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), 0L, null, false, false, false, 62, null);
    }

    public static final Object invoke$1(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        GlobalHashTagStickerModel setState = (GlobalHashTagStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return GlobalHashTagStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), 0L, null, false, false, false, 62, null);
    }

    public static final Object invoke$10(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        AddYoursStickerModel setState = (AddYoursStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddYoursStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        if ((!kotlin.jvm.internal.o.LIZJ(r0, r8.f1)) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS5S0100001_2 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS5S0100001_2.invoke$2(kotlin.jvm.internal.AqS5S0100001_2, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        return aqS5S0100001_2.invoke$0((C6GQ) obj);
    }

    public static final Object invoke$4(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, null, null, null, 0.0f, false, ((C6M6) aqS5S0100001_2.l0).LLFFF(aqS5S0100001_2.f1), null, null, null, 1919);
    }

    public static final Object invoke$5(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        SingleHashTagStickerModel setState = (SingleHashTagStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SingleHashTagStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), 0L, null, false, false, false, 62, null);
    }

    public static final Object invoke$6(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        TextStickerModel setState = (TextStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TextStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
    }

    public static final Object invoke$7(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        TextStickerModel setState = (TextStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TextStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
    }

    public static final Object invoke$8(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C131555Eh.LIZ(setState, 0L, 0L, null, null, null, null, new C08630Vn(new OSZ((C52V) aqS5S0100001_2.l0, Float.valueOf(aqS5S0100001_2.f1))), 63);
    }

    public static final Object invoke$9(AqS5S0100001_2 aqS5S0100001_2, Object obj) {
        QAStickerModel setState = (QAStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return QAStickerModel.copy$default(setState, BaseStickerModel.copy$default((BaseStickerModel) aqS5S0100001_2.l0, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, aqS5S0100001_2.f1, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null), 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0.0f, 0L, null, null, 4194302, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0100001_2(float f, C6GJ c6gj, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = c6gj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0100001_2(C52V c52v, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c52v;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0100001_2(C6M6 c6m6, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c6m6;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0100001_2(FilterBean filterBean, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = filterBean;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0100001_2(BaseStickerModel baseStickerModel, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseStickerModel;
        this.f1 = f;
    }
}
