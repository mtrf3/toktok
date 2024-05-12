package X;

import Y.AgS120S0100000_2;
import Y.AgS72S0300000_2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverTextAttr;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157766Hc {
    public final ActivityC45651qj LIZ;
    public final ViewGroup LIZIZ;
    public final ViewGroup LIZJ;
    public final ViewGroup LIZLLL;
    public final EffectTextModel LJ;
    public final List<C157776Hd> LJFF;
    public final List<C157916Hr> LJI;
    public boolean LJII;
    public T3D LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C157966Hw LJIIJJI;
    public final C1555068k LJIIL;
    public String LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public AnonymousClass684 LJIILL;
    public AqS168S0100000_2 LJIILLIIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final C62822Ol8 LJIJI;
    public final C62822Ol8 LJIJJ;
    public final C157926Hs LJIJJLI;

    public final C6I1<C157776Hd> LJ() {
        return (C6I1) this.LJIIIZ.getValue();
    }

    public final C6I1<C157916Hr> LJFF() {
        return (C6I1) this.LJIIJ.getValue();
    }

    public final C67S LJI() {
        return (C67S) this.LJIILJJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List<C157776Hd> list) {
        Object obj;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 1;
        Effect effect = new Effect(null, i, 0 == true ? 1 : 0);
        String string = this.LIZ.getString(R.string.p74);
        o.LJIIIIZZ(string, "appCompatActivity.getStr…ostpage_coverselect_none)");
        effect.setName(string);
        ListProtector.add(list, 0, new C157776Hd(effect, new EffectTextEffectExtra(false, true)));
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C157776Hd) obj).LJLJI.ifStandard) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C157816Hh c157816Hh = (C157816Hh) obj;
        if (c157816Hh != null) {
            Effect effect2 = c157816Hh.effect;
            String string2 = this.LIZ.getString(R.string.p77);
            o.LJIIIIZZ(string2, "appCompatActivity.getStr…age_coverselect_standard)");
            effect2.setName(string2);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        Effect effect3 = new Effect(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        effect3.setEffectId("standard");
        String string3 = this.LIZ.getString(R.string.p77);
        o.LJIIIIZZ(string3, "appCompatActivity.getStr…age_coverselect_standard)");
        effect3.setName(string3);
        ListProtector.add(arrayList, 1, new C157776Hd(effect3, new EffectTextEffectExtra(true, false)));
    }

    public final void LIZIZ(C157776Hd c157776Hd) {
        if (o.LJ(LJI().LLJILJILJ, c157776Hd.effect.getEffectId())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(LJ().LIZ(c157776Hd)));
            Iterator<C157916Hr> it = c157776Hd.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(LJFF().LIZ(it.next())));
            }
            int LJJJJL = C45804HyK.LJJJJL(arrayList);
            if (LJJJJL == 4 || LJJJJL == 16) {
                C67S LJI = LJI();
                LJI.getClass();
                if (o.LJ(LJI.LLJILJILJ, c157776Hd.effect.getEffectId())) {
                    LJI.LJJIL(c157776Hd);
                }
            }
        }
    }

    public final void LIZLLL(String stylePanel, String fontPanel, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(stylePanel, "stylePanel");
        o.LJIIIZ(fontPanel, "fontPanel");
        XKX.LIZLLL((InterfaceC70422pa) this.LJIJ.getValue(), null, null, new C157876Hn(this, fontPanel, z, stylePanel, interfaceC65784Pro, null), 3);
    }

    public C157766Hc(ActivityC45651qj appCompatActivity, ViewGroup panelContainer, ViewGroup inputContainer, ViewGroup previewContainer, EffectTextModel effectTextModel, C1554768h c1554768h) {
        o.LJIIIZ(appCompatActivity, "appCompatActivity");
        o.LJIIIZ(panelContainer, "panelContainer");
        o.LJIIIZ(inputContainer, "inputContainer");
        o.LJIIIZ(previewContainer, "previewContainer");
        this.LIZ = appCompatActivity;
        this.LIZIZ = panelContainer;
        this.LIZJ = inputContainer;
        this.LIZLLL = previewContainer;
        this.LJ = effectTextModel;
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 751));
        this.LJIIJ = C221108m2.LIZIZ(C157806Hg.LJLIL);
        this.LJIIJJI = new C157966Hw(appCompatActivity, LJ(), LJFF(), new AqS168S0100000_2(this, 457), new AqS152S0100000_2(this, 753));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(appCompatActivity), R.layout.au9, inputContainer, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerInputLayout");
        C1555068k c1555068k = (C1555068k) LLLLIILL;
        this.LJIIL = c1555068k;
        inputContainer.addView(c1555068k);
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS149S0200000_2(this, c1554768h, 75));
        this.LJIJ = C221108m2.LIZIZ(C157826Hi.LJLIL);
        this.LJIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 750));
        this.LJIJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 752));
        InterfaceC84497XEf interfaceC84497XEf = C69E.LIZIZ;
        if (interfaceC84497XEf != null) {
            this.LJIJJLI = new C157926Hs(interfaceC84497XEf);
        } else {
            o.LJIJI("effectTextPlatform");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(EffectTextModel effectTextModel, String draftDir, OSZ<Integer, Integer> osz, boolean z, boolean z2, Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
        char c;
        String str;
        String str2;
        int i;
        TextStickerData data;
        o.LJIIIZ(effectTextModel, "effectTextModel");
        o.LJIIIZ(draftDir, "draftDir");
        C1552367j c1552367j = new C1552367j(draftDir, osz.getFirst().intValue(), osz.getSecond().intValue(), 0, 0);
        effectTextModel.reset();
        C67S LJI = LJI();
        LJI.getClass();
        C67P c67p = LJI.LLF;
        if (c67p != null && (data = c67p.getData()) != null) {
            innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
        } else {
            innerEffectTextLayoutConfig = null;
        }
        String str3 = "";
        if (innerEffectTextLayoutConfig == null) {
            boolean LJJIJLIJ = LJI.LJJIJLIJ();
            str = LJI.LLJILJILJ;
            if (str == null) {
                str = "";
            }
            String str4 = LJI.LLJIJIL;
            str2 = LJI.LLJ;
            AnonymousClass684 anonymousClass684 = LJI.LLIZ;
            if (anonymousClass684 != null) {
                String str5 = LJI.LLJILJILJ;
                if (str5 != null) {
                    str3 = str5;
                }
                anonymousClass684.LJII(new C6VN(z2, str3, LJI.LLJIJIL, LJI.LLJILJIL, LJI.LLJ, LJI.LLIZLLLIL, LJI.LJJIJLIJ() ? 1 : 0, z ? 1 : 0, 0, num, 256));
            }
            str3 = str4;
            i = LJJIJLIJ;
        } else {
            int i2 = 2;
            if (LJI.LJJIJLIJ()) {
                c = 1;
            } else {
                c = 2;
            }
            str = LJI.LLJILJILJ;
            if (str == null) {
                str = "";
            }
            AnonymousClass684 anonymousClass6842 = LJI.LLIZ;
            if (anonymousClass6842 != null) {
                if (LJI.LJJIJLIJ()) {
                    i2 = 1;
                }
                anonymousClass6842.LJII(new C6VN(z2, str, null, null, null, null, i2, z ? 1 : 0, 0, num, 316));
            }
            str2 = "";
            i = c;
        }
        effectTextModel.setCreateAwemeCoverInfo(new CreateAwemeCoverInfo(i, z ? 1 : 0, new CreateAwemeCoverTextAttr(str, str3, str2)));
        C67R c67r = (C67R) LJI.LLF;
        if (c67r != null) {
            if (c67r.LJLJJLL == null) {
                c67r.LJLJJLL = new ArrayList();
            }
            Iterator<C1555768r> it = c67r.LLIIZ.LJLIL.iterator();
            while (it.hasNext()) {
                WH4 wh4 = it.next().LIZ;
                wh4.setMinWidth(wh4.getWidth());
            }
            List<TextStickerTextWrap> mTextWrapList = c67r.LJLJJLL;
            o.LJIIIIZZ(mTextWrapList, "mTextWrapList");
            c67r.LJJIJ(c67r.LLILLIZIL, mTextWrapList);
            TextStickerData data2 = c67r.getData();
            if (data2 != null) {
                data2.setEffectTextLayoutConfig(LJI.LLJILLL);
            }
        }
        C67S LJI2 = LJI();
        LJI2.getClass();
        LJI2.LJIIL().LIZLLL();
        LJI2.LJIIL().kf(c1552367j, LJI2.LJLJJI).LJIILLIIL(new AgS72S0300000_2(c1552367j, this, effectTextModel, 6), C10K.LJIIIIZZ).LIZLLL(new AgS120S0100000_2(interfaceC65784Pro, 21));
    }
}
