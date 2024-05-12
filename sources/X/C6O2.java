package X;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6O2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6O2 extends C6O6 {
    public final ViewGroup LIZIZ;
    public final C6OA LIZJ;
    public final C1NS<TextStickerModel> LIZLLL;
    public final LifecycleOwner LJ;
    public final C6O5 LJFF;
    public final C6OE LJI;
    public final C6O9 LJII;

    public final void LIZIZ() {
        int mode;
        C6OA c6oa = this.LIZJ;
        if (this.LIZLLL.LJ.getMode() == 5) {
            mode = this.LIZJ.LJIIIZ;
        } else {
            mode = this.LIZLLL.LJ.getMode();
        }
        c6oa.LJIIIZ = mode;
        TextFontModel fontModel = this.LIZLLL.LJ.getFontModel();
        if (fontModel.fontId.length() == 0 || fontModel.fontName.length() == 0 || fontModel.fileName.length() == 0 || fontModel.localPath.length() == 0 || fontModel.fontTitle.length() == 0) {
            this.LJFF.LIZLLL(this.LIZLLL.LJ.getFontModel().fileName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.5dr] */
    public C6O2(ViewGroup viewGroup, C6OA abilityContainer) {
        super(abilityContainer);
        o.LJIIIZ(abilityContainer, "abilityContainer");
        this.LIZIZ = viewGroup;
        this.LIZJ = abilityContainer;
        C1NS<TextStickerModel> c1ns = abilityContainer.LIZJ;
        this.LIZLLL = c1ns;
        LifecycleOwner lifecycleOwner = abilityContainer.LIZIZ;
        this.LJ = lifecycleOwner;
        C6O5 c6o5 = abilityContainer.LJ;
        this.LJFF = c6o5;
        this.LJI = abilityContainer.LIZLLL;
        this.LJII = (C6O9) LIZ(C65352Pkq.LIZ(C6O9.class));
        viewGroup.addView(c6o5.LJ());
        c6o5.LIZJ(new InterfaceC139605ds() { // from class: X.5dr
            @Override // X.InterfaceC139605ds
            public final void LIZ(TextFontModel textFontModel, boolean z) {
                C6O2 c6o2;
                C6OE c6oe;
                C6O2 c6o22 = C6O2.this;
                c6o22.LIZLLL.LJ(new AqS133S0200000_2(c6o22, textFontModel, 97));
                if (z && (c6oe = (c6o2 = C6O2.this).LJI) != null) {
                    c6oe.LJI(c6o2.LIZLLL.LJ);
                }
            }
        });
        LIZIZ();
        c1ns.LIZ(new TBT() { // from class: X.6Nz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }
        }).LJII(new TBT() { // from class: X.6Ns
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((TextFontModel) obj).fileName;
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 442));
        c1ns.LIZ(new TBT() { // from class: X.6O0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }
        }).LJII(new TBT() { // from class: X.5dt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextFontModel) obj).enableBgColor);
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 444));
        c1ns.LIZ(new TBT() { // from class: X.6O1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }
        }).LJII(new TBT() { // from class: X.5du
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextFontModel) obj).enableMaskBlurLightColor);
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 433));
    }
}
