package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS6S0101000_2;
import Y.IDiS266S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6LV, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6LV extends RelativeLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public C80675VlP LJLJI;
    public VWH LJLJJI;
    public C71897SJp LJLJJL;
    public TuxTextView LJLJJLL;
    public LinearLayout LJLJL;
    public TuxTextView LJLJLJ;
    public final List<List<ReadTextEffectBean>> LJLJLLL;
    public C73305Spp LJLL;
    public C6LX LJLLI;
    public C6LY LJLLILLLL;
    public final List<EditTTSPanelFragment> LJLLJ;
    public IDiS266S0100000_2 LJLLL;
    public SY4 LJLLLL;
    public View LJLLLLLL;
    public RelativeLayout LJLZ;

    public final View getContentView() {
        VWH vwh = this.LJLJJI;
        if (vwh == null) {
            return null;
        }
        return vwh;
    }

    public final int getCurrentItemIndex() {
        VWH vwh = this.LJLJJI;
        if (vwh != null) {
            return vwh.getCurrentItem();
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IDiS266S0100000_2 iDiS266S0100000_2 = this.LJLLL;
        if (iDiS266S0100000_2 != null) {
            VWH vwh = this.LJLJJI;
            if (vwh != null) {
                vwh.removeOnPageChangeListener(iDiS266S0100000_2);
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        this.LJLLL = null;
    }

    public static boolean LIZ(List list) {
        if (!ERZ.LIZJ()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) it.next();
            if (ERZ.LIZ(readTextEffectBean.mSpeaker.ttsReleaseDate)) {
                String lokiId = readTextEffectBean.effect.getEffect_id();
                o.LJIIIZ(lokiId, "lokiId");
                if (ERZ.LIZJ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(SpeakerCenter.LIZJ());
                    LIZ.append("tts_red_dot_shown_list_");
                    LIZ.append(lokiId);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    Keva keva = SpeakerCenter.LIZ;
                    if (keva.contains(LIZIZ)) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        long j = keva.getLong(LIZIZ, -1L);
                        if (ERZ.LIZLLL() + j < currentTimeMillis) {
                            keva.erase(LIZIZ);
                        } else if (ERZ.LIZ(j)) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    public final void setCheckBox(boolean z) {
        C71897SJp c71897SJp = this.LJLJJL;
        if (c71897SJp != null) {
            c71897SJp.setChecked(z);
        } else {
            o.LJIJI("checkbox");
            throw null;
        }
    }

    public final void setCheckBoxText(String value) {
        o.LJIIIZ(value, "value");
        TuxTextView tuxTextView = this.LJLJJLL;
        if (tuxTextView != null) {
            tuxTextView.setText(value);
        } else {
            o.LJIJI("checkboxText");
            throw null;
        }
    }

    public final void setContentLayoutHeight(int i) {
        RelativeLayout relativeLayout = this.LJLZ;
        if (relativeLayout != null) {
            relativeLayout.post(new ARunnableS6S0101000_2(i, this, 7));
        } else {
            o.LJIJI("contentLayout");
            throw null;
        }
    }

    public final void setOnCheckBoxChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        o.LJIIIZ(listener, "listener");
        C71897SJp c71897SJp = this.LJLJJL;
        if (c71897SJp != null) {
            c71897SJp.setOnCheckedChangeListener(listener);
        } else {
            o.LJIJI("checkbox");
            throw null;
        }
    }

    public final void setOnParentLayoutListener(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        View view = this.LJLILLLLZI;
        if (view != null) {
            C16880lQ.LJIIJ(listener, view);
        } else {
            o.LJIJI("parentLayout");
            throw null;
        }
    }

    public final void setPlayViewVisible(int i) {
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(i);
        } else {
            o.LJIJI("playView");
            throw null;
        }
    }

    public final void setTTSPanelBeanOpt(final C6LY beanOpt) {
        o.LJIIIZ(beanOpt, "beanOpt");
        if (ERZ.LIZJ()) {
            beanOpt = new C6LY(this, beanOpt) { // from class: X.6LW
                public final C6LY LJLIL;
                public final /* synthetic */ C6LV LJLILLLLZI;

                @Override // X.C6LY
                public final boolean LLD(String textSpeaker) {
                    o.LJIIIZ(textSpeaker, "textSpeaker");
                    return this.LJLIL.LLD(textSpeaker);
                }

                @Override // X.C6LY
                public final void LLF() {
                    this.LJLIL.LLF();
                }

                @Override // X.C6LY
                public final void LLFF(ReadTextEffectBean readTextEffectBean) {
                    this.LJLIL.LLFF(readTextEffectBean);
                }

                @Override // X.C6LY
                public final void LLFFF(ReadTextEffectBean model) {
                    o.LJIIIZ(model, "model");
                    this.LJLIL.LLFFF(model);
                }

                @Override // X.C6LY
                public final void LLFII(ReadTextEffectBean bean) {
                    o.LJIIIZ(bean, "bean");
                    this.LJLIL.LLFII(bean);
                }

                @Override // X.C6LY
                public final void LLFZ(ReadTextEffectBean readTextEffectBean) {
                    this.LJLIL.LLFZ(readTextEffectBean);
                }

                {
                    o.LJIIIZ(beanOpt, "proxy");
                    this.LJLILLLLZI = this;
                    this.LJLIL = beanOpt;
                }

                @Override // X.C6LY
                public final void LLIIII(ArrayList<ReadTextEffectBean> arrayList, int i, boolean z) {
                    this.LJLIL.LLIIII(arrayList, i, z);
                    if (z) {
                        C6LV c6lv = this.LJLILLLLZI;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<ReadTextEffectBean> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ReadTextEffectBean next = it.next();
                            c6lv.getClass();
                            if (ERZ.LIZ(next.mSpeaker.ttsReleaseDate)) {
                                arrayList2.add(next);
                            }
                        }
                        C6LV c6lv2 = this.LJLILLLLZI;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) it2.next();
                            String lokiId = readTextEffectBean.effect.getEffect_id();
                            long j = readTextEffectBean.mSpeaker.ttsReleaseDate;
                            c6lv2.getClass();
                            o.LJIIIZ(lokiId, "lokiId");
                            if (ERZ.LIZJ()) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(SpeakerCenter.LIZJ());
                                LIZ.append("tts_red_dot_shown_list_");
                                LIZ.append(lokiId);
                                String LIZIZ = X1D.LIZIZ(LIZ);
                                Keva keva = SpeakerCenter.LIZ;
                                keva.storeLong(LIZIZ, j);
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(SpeakerCenter.LIZJ());
                                LIZ2.append("tts_red_dot_shown_set");
                                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                                java.util.Set<String> stringSet = keva.getStringSet(LIZIZ2, new LinkedHashSet());
                                stringSet.add(lokiId);
                                keva.storeStringSet(LIZIZ2, stringSet);
                            }
                            C80675VlP c80675VlP = c6lv2.LJLJI;
                            View view = null;
                            if (c80675VlP != null) {
                                C80674VlO LJIIJ = c80675VlP.LJIIJ(i);
                                if (LJIIJ != null) {
                                    view = LJIIJ.LJFF;
                                }
                                if (view instanceof THN) {
                                    ((THN) view).LIZ(C6LV.LIZ(arrayList));
                                }
                            } else {
                                o.LJIJI("tabLayout");
                                throw null;
                            }
                        }
                    }
                }
            };
        }
        this.LJLLILLLL = beanOpt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6LV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJLLL = new ArrayList();
        this.LJLLJ = new ArrayList();
        setBackgroundColor(0);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ccs, C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…ene_edit_tts_panel, this)");
        this.LJLILLLLZI = LLLZIIL;
        View findViewById = findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.content_layout)");
        this.LJLZ = (RelativeLayout) findViewById;
        if (C58B.LIZ()) {
            RelativeLayout relativeLayout = this.LJLZ;
            if (relativeLayout != null) {
                relativeLayout.setBackgroundResource(R.drawable.s4);
            } else {
                o.LJIJI("contentLayout");
                throw null;
            }
        }
        View findViewById2 = findViewById(R.id.f7s);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_none)");
        this.LJLLLLLL = findViewById2;
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 56), findViewById2);
        View view = this.LJLLLLLL;
        if (view != null) {
            view.setVisibility(8);
            View findViewById3 = findViewById(R.id.lbb);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.tl_tts_panel)");
            this.LJLJI = (C80675VlP) findViewById3;
            Integer LJI = C79045V0n.LJI(R.attr.dm, context);
            if (LJI != null) {
                int intValue = LJI.intValue();
                Integer LJI2 = C79045V0n.LJI(R.attr.dj, context);
                if (LJI2 != null) {
                    int intValue2 = LJI2.intValue();
                    C80675VlP c80675VlP = this.LJLJI;
                    if (c80675VlP != null) {
                        c80675VlP.setTabTextColors(C80675VlP.LJII(intValue, intValue2));
                    } else {
                        o.LJIJI("tabLayout");
                        throw null;
                    }
                }
            }
            C80675VlP c80675VlP2 = this.LJLJI;
            if (c80675VlP2 != null) {
                c80675VlP2.post(new ARunnableS38S0100000_2(this, 112));
                View findViewById4 = findViewById(R.id.b_o);
                o.LJIIIIZZ(findViewById4, "findViewById(R.id.checkbox)");
                this.LJLJJL = (C71897SJp) findViewById4;
                View findViewById5 = findViewById(R.id.b_t);
                o.LJIIIIZZ(findViewById5, "findViewById(R.id.checkbox_text)");
                this.LJLJJLL = (TuxTextView) findViewById5;
                View findViewById6 = findViewById(R.id.ap8);
                o.LJIIIIZZ(findViewById6, "findViewById(R.id.bottom_check_layout)");
                LinearLayout linearLayout = (LinearLayout) findViewById6;
                this.LJLJL = linearLayout;
                C16880lQ.LJIIZILJ(linearLayout, new ACListenerS22S0100000_2(this, 57));
                View findViewById7 = findViewById(R.id.hsb);
                o.LJIIIIZZ(findViewById7, "findViewById(R.id.play_view)");
                this.LJLIL = findViewById7;
                View findViewById8 = findViewById(R.id.l3y);
                o.LJIIIIZZ(findViewById8, "findViewById(R.id.text_done)");
                TuxTextView tuxTextView = (TuxTextView) findViewById8;
                this.LJLJLJ = tuxTextView;
                C16880lQ.LJJJJI(tuxTextView, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 29));
                this.LJLL = (C73305Spp) findViewById(R.id.g8y);
                View findViewById9 = findViewById(R.id.lt7);
                o.LJIIIIZZ(findViewById9, "findViewById(R.id.tts_view_pager)");
                VWH vwh = (VWH) findViewById9;
                this.LJLJJI = vwh;
                IDiS266S0100000_2 iDiS266S0100000_2 = new IDiS266S0100000_2(this, 4);
                this.LJLLL = iDiS266S0100000_2;
                vwh.addOnPageChangeListener(iDiS266S0100000_2);
                View findViewById10 = findViewById(R.id.b3r);
                o.LJIIIIZZ(findViewById10, "findViewById(R.id.cancel_btn)");
                SY4 sy4 = (SY4) findViewById10;
                this.LJLLLL = sy4;
                C16880lQ.LJJIZ(sy4, new ACListenerS22S0100000_2(this, 58));
                LinearLayout linearLayout2 = this.LJLJL;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("checkBoxLayout");
                    throw null;
                }
            }
            o.LJIJI("tabLayout");
            throw null;
        }
        o.LJIJI("noneIv");
        throw null;
    }
}
