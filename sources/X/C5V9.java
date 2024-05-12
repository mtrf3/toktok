package X;

import android.graphics.Point;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import kotlin.jvm.internal.o;

/* renamed from: X.5V9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5V9 extends AbstractC65781Prl implements InterfaceC88472Yns<TextStickerTextWrap, C76800UCe> {
    public final /* synthetic */ TextStickerData LJLIL;
    public final /* synthetic */ StickerItemModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC142515iZ LJLJJL;
    public final /* synthetic */ InfoStickerModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5V9(TextStickerData textStickerData, StickerItemModel stickerItemModel, int i, int i2, InterfaceC142515iZ interfaceC142515iZ, InfoStickerModel infoStickerModel) {
        super(1);
        this.LJLIL = textStickerData;
        this.LJLILLLLZI = stickerItemModel;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = interfaceC142515iZ;
        this.LJLJJLL = infoStickerModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TextStickerTextWrap it) {
        C63D LIZ;
        o.LJIIIZ(it, "it");
        this.LJLIL.setEditCenterPoint(new Point(C143205jg.LJ() / 2, C143205jg.LIZLLL() / 2));
        this.LJLILLLLZI.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), this.LJLIL);
        if (this.LJLJI == this.LJLJJI - 1 && (LIZ = this.LJLJJL.PI().LIZ()) != null) {
            LIZ.b1(this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }
}
