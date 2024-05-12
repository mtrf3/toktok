package X;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.text.TextApplyAction$execute$2", f = "TextApplyAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137375aH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C45284Hpw LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137375aH(C45284Hpw c45284Hpw, String str, InterfaceC67352kd<? super C137375aH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c45284Hpw;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137375aH(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        C45284Hpw c45284Hpw = this.LJLIL;
        C82632Wbs c82632Wbs = c45284Hpw.LJLJJI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C45284Hpw.LJLJJLL;
        InterfaceC139655dx LIZ = ((InterfaceC142515iZ) c82632Wbs.LIZ(c45284Hpw, interfaceC74236TBoArr[0])).mu().LIZ();
        if (LIZ == null) {
            return null;
        }
        final C45284Hpw c45284Hpw2 = this.LJLIL;
        String str = this.LJLILLLLZI;
        float LJ = C74275TDb.LJ(c45284Hpw2.LJLIL) / 2.0f;
        float LIZLLL = C74275TDb.LIZLLL(c45284Hpw2.LJLIL) * 0.14f;
        Point point = new Point(C74275TDb.LJ(c45284Hpw2.LJLIL) / 2, C74275TDb.LIZLLL(c45284Hpw2.LJLIL) / 2);
        InterfaceC153045zY value = ((InterfaceC143655kP) c45284Hpw2.LJLJJL.LIZ(c45284Hpw2, interfaceC74236TBoArr[1])).Kh().getValue();
        if (value != null) {
            i = value.getDuration();
        } else {
            i = 0;
        }
        final TextStickerData textStickerData = new TextStickerData(str, 4, -1, 2, null, point, 0, i, 0, i, LJ, LIZLLL, 0L, false, false, false, null, 0.0f, 1.0f, false, false, false, 0, null, null, null, null, 0, null, null, 22, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, true, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1074008048, -1, 1048543, null);
        textStickerData.setFontType("Proxima-Nova-Semibold.otf");
        final C1551767d c1551767d = new C1551767d(c45284Hpw2.LJLIL, null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        c1551767d.setVisibility(4);
        int LIZIZ = (int) C74275TDb.LIZIZ(c45284Hpw2.LJLIL, 32.0f);
        int LIZIZ2 = (int) C74275TDb.LIZIZ(c45284Hpw2.LJLIL, 12.0f);
        c1551767d.setPadding(LIZIZ, LIZIZ2, LIZIZ, LIZIZ2);
        c1551767d.setTextSize(1, 28.0f);
        ((InterfaceC143655kP) c45284Hpw2.LJLJJL.LIZ(c45284Hpw2, interfaceC74236TBoArr[1])).Iy().addView(c1551767d, layoutParams);
        c1551767d.setFontType(C68M.LJIIJ().LJIIL(textStickerData.getFontType()));
        c1551767d.setAligin(textStickerData.getAlign());
        c1551767d.setText(textStickerData.getTextStr());
        c1551767d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.5aI
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                o.LJIIIZ(view, "view");
                view.removeOnLayoutChangeListener(this);
                textStickerData.setTextWrapList(C47261Igj.LJII(C68W.LIZ(C1551767d.this, new ArrayList())));
                C45284Hpw c45284Hpw3 = c45284Hpw2;
                C16880lQ.LJLLLL(C1551767d.this, ((InterfaceC143655kP) c45284Hpw3.LJLJJL.LIZ(c45284Hpw3, C45284Hpw.LJLJJLL[1])).Iy());
            }
        });
        LIZ.c8(textStickerData, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
