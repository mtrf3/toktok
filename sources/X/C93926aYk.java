package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit;
import com.bytedance.ugc.effectcreator.main.MainImpl;
import com.bytedance.ugc.effectcreator.main.MainLiveData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aYk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93926aYk {
    public final XLM LIZ = V8H.LIZ(Boolean.TRUE);
    public boolean LIZIZ;
    public final InterfaceC65784Pro<LifecycleOwner> LIZJ;
    public final InterfaceC65784Pro<C94349afZ> LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;

    public final void LIZIZ() {
        EnumC93993aZp enumC93993aZp;
        EnumC93712aVI enumC93712aVI;
        EnumC93888aY8 enumC93888aY8;
        boolean z;
        String str;
        LiveData<EnumC93888aY8> pageState;
        LiveData<EnumC93712aVI> layerPageStatus;
        LiveData<EnumC93993aZp> panelStateLiveData;
        InterfaceC71762rk<Boolean> focusState;
        C34K c34k = new C34K();
        c34k.element = false;
        AbstractC93937aYv value = C93939aYx.LIZ().getRenderModeData().getValue();
        if (o.LJ(value, C94504ai4.LIZ)) {
            LJFF(true);
        } else if ((value instanceof C94503ai3) && !((C94503ai3) value).LIZ) {
            LJFF(false);
        } else {
            IAssetEditor LIZ = C93979aZb.LIZ();
            if (LIZ != null && (focusState = LIZ.getFocusState()) != null && focusState.getValue().booleanValue()) {
                C93729aVZ.LIZLLL(LIZJ().LLILL);
                C93729aVZ.LIZLLL(LIZJ().LJLLLLLL);
                RelativeLayout relativeLayout = LIZJ().LLF;
                o.LJIIIIZZ(relativeLayout, "binding.flAdd");
                relativeLayout.setVisibility(4);
                RelativeLayout relativeLayout2 = LIZJ().LLILII;
                o.LJIIIIZZ(relativeLayout2, "binding.rlLayer");
                relativeLayout2.setVisibility(4);
                RelativeLayout relativeLayout3 = LIZJ().LLIL;
                o.LJIIIIZZ(relativeLayout3, "binding.rlController");
                relativeLayout3.setVisibility(4);
            } else {
                IBehaviour LIZ2 = C93992aZo.LIZ();
                if (LIZ2 != null && (panelStateLiveData = LIZ2.getPanelStateLiveData()) != null) {
                    enumC93993aZp = panelStateLiveData.getValue();
                } else {
                    enumC93993aZp = null;
                }
                if (enumC93993aZp == EnumC93993aZp.Show) {
                    C93729aVZ.LIZLLL(LIZJ().LJLLLLLL);
                    C93729aVZ.LJI(LIZJ().LLILL);
                    C93729aVZ.LJI(LIZJ().LLIIIZ);
                    RelativeLayout relativeLayout4 = LIZJ().LLF;
                    o.LJIIIIZZ(relativeLayout4, "binding.flAdd");
                    relativeLayout4.setVisibility(4);
                    ImageView imageView = LIZJ().LLIFFJFJJ;
                    o.LJIIIIZZ(imageView, "binding.ivLayer");
                    imageView.setVisibility(4);
                    RelativeLayout relativeLayout5 = LIZJ().LLIL;
                    o.LJIIIIZZ(relativeLayout5, "binding.rlController");
                    relativeLayout5.setVisibility(4);
                    RelativeLayout relativeLayout6 = LIZJ().LLILII;
                    o.LJIIIIZZ(relativeLayout6, "binding.rlLayer");
                    relativeLayout6.setVisibility(4);
                    C93729aVZ.LIZLLL(LIZJ().LJLJL);
                    C93729aVZ.LIZLLL(LIZJ().LJLLL);
                    C93729aVZ.LIZLLL(LIZJ().LLFZ);
                    C93729aVZ.LIZJ(LIZJ().LLIILZL);
                    C93729aVZ.LIZJ(LIZJ().LLIIIILZ);
                    C93729aVZ.LIZJ(LIZJ().LLFF);
                    C93729aVZ.LIZJ(LIZJ().LLIIII);
                    C93729aVZ.LIZJ(LIZJ().LLI);
                    C93729aVZ.LJI(LIZJ().LLIILII);
                } else if (C93819aX1.LIZ().getPanelStateLiveData().getValue() == EnumC93488aRg.SHOW) {
                    C93729aVZ.LIZLLL(LIZJ().LLILL);
                    C93729aVZ.LIZLLL(LIZJ().LJLLLLLL);
                    RelativeLayout relativeLayout7 = LIZJ().LLF;
                    o.LJIIIIZZ(relativeLayout7, "binding.flAdd");
                    relativeLayout7.setVisibility(4);
                    RelativeLayout relativeLayout8 = LIZJ().LLILII;
                    o.LJIIIIZZ(relativeLayout8, "binding.rlLayer");
                    relativeLayout8.setVisibility(4);
                    RelativeLayout relativeLayout9 = LIZJ().LLIL;
                    o.LJIIIIZZ(relativeLayout9, "binding.rlController");
                    relativeLayout9.setVisibility(4);
                } else {
                    ILayer LIZ3 = C93709aVF.LIZ();
                    if (LIZ3 != null && (layerPageStatus = LIZ3.getLayerPageStatus()) != null) {
                        enumC93712aVI = layerPageStatus.getValue();
                    } else {
                        enumC93712aVI = null;
                    }
                    if (enumC93712aVI == EnumC93712aVI.SHOW) {
                        C93729aVZ.LIZLLL(LIZJ().LJLLLLLL);
                        RelativeLayout relativeLayout10 = LIZJ().LLF;
                        o.LJIIIIZZ(relativeLayout10, "binding.flAdd");
                        relativeLayout10.setVisibility(4);
                        RelativeLayout relativeLayout11 = LIZJ().LLILII;
                        o.LJIIIIZZ(relativeLayout11, "binding.rlLayer");
                        relativeLayout11.setVisibility(4);
                        RelativeLayout relativeLayout12 = LIZJ().LLIL;
                        o.LJIIIIZZ(relativeLayout12, "binding.rlController");
                        relativeLayout12.setVisibility(4);
                        C93729aVZ.LJI(LIZJ().LJLJL);
                        C93729aVZ.LIZLLL(LIZJ().LJLLL);
                        C93729aVZ.LIZLLL(LIZJ().LLFZ);
                        C93729aVZ.LJI(LIZJ().LLILL);
                        C93729aVZ.LIZJ(LIZJ().LLFF);
                        LJI();
                        C93729aVZ.LJI(LIZJ().LLIIII);
                        C93729aVZ.LIZJ(LIZJ().LLIILII);
                        C93729aVZ.LJI(LIZJ().LLII);
                        C93729aVZ.LJI(LIZJ().LLIIIZ);
                        LJ();
                        LIZ(true);
                    } else {
                        ITextEdit LIZ4 = C93887aY7.LIZ();
                        if (LIZ4 != null && (pageState = LIZ4.getPageState()) != null) {
                            enumC93888aY8 = pageState.getValue();
                        } else {
                            enumC93888aY8 = null;
                        }
                        if (enumC93888aY8 == EnumC93888aY8.SHOW) {
                            C93729aVZ.LIZLLL(LIZJ().LLILL);
                            C93729aVZ.LIZLLL(LIZJ().LJLLLLLL);
                            RelativeLayout relativeLayout13 = LIZJ().LLF;
                            o.LJIIIIZZ(relativeLayout13, "binding.flAdd");
                            relativeLayout13.setVisibility(4);
                            RelativeLayout relativeLayout14 = LIZJ().LLILII;
                            o.LJIIIIZZ(relativeLayout14, "binding.rlLayer");
                            relativeLayout14.setVisibility(4);
                            RelativeLayout relativeLayout15 = LIZJ().LLIL;
                            o.LJIIIIZZ(relativeLayout15, "binding.rlController");
                            relativeLayout15.setVisibility(4);
                        } else if (C93726aVW.LIZIZ().getPanelStatus().getValue() == EnumC93821aX3.SHOW) {
                            C93729aVZ.LIZLLL(LIZJ().LLILL);
                            RelativeLayout relativeLayout16 = LIZJ().LLF;
                            o.LJIIIIZZ(relativeLayout16, "binding.flAdd");
                            relativeLayout16.setVisibility(4);
                            RelativeLayout relativeLayout17 = LIZJ().LLILII;
                            o.LJIIIIZZ(relativeLayout17, "binding.rlLayer");
                            relativeLayout17.setVisibility(4);
                            RelativeLayout relativeLayout18 = LIZJ().LLIL;
                            o.LJIIIIZZ(relativeLayout18, "binding.rlController");
                            relativeLayout18.setVisibility(4);
                        } else {
                            C93729aVZ.LJI(LIZJ().LLILL);
                            C93729aVZ.LIZLLL(LIZJ().LJLLLLLL);
                            RelativeLayout relativeLayout19 = LIZJ().LLF;
                            o.LJIIIIZZ(relativeLayout19, "binding.flAdd");
                            relativeLayout19.setVisibility(0);
                            if (this.LJ.invoke().booleanValue()) {
                                C93729aVZ.LIZLLL(LIZJ().LLIIIZ);
                                C93729aVZ.LIZLLL(LIZJ().LLIFFJFJJ);
                                C93729aVZ.LIZLLL(LIZJ().LLIL);
                                C93729aVZ.LIZLLL(LIZJ().LLILII);
                                LIZLLL(true);
                            } else {
                                C93729aVZ.LJI(LIZJ().LLIIIZ);
                                ImageView imageView2 = LIZJ().LLIFFJFJJ;
                                o.LJIIIIZZ(imageView2, "binding.ivLayer");
                                imageView2.setVisibility(0);
                                RelativeLayout relativeLayout20 = LIZJ().LLIL;
                                o.LJIIIIZZ(relativeLayout20, "binding.rlController");
                                relativeLayout20.setVisibility(0);
                                RelativeLayout relativeLayout21 = LIZJ().LLILII;
                                o.LJIIIIZZ(relativeLayout21, "binding.rlLayer");
                                relativeLayout21.setVisibility(0);
                                LIZLLL(false);
                            }
                            C93729aVZ.LIZLLL(LIZJ().LJLJL);
                            C93729aVZ.LIZLLL(LIZJ().LJLLL);
                            C93729aVZ.LJI(LIZJ().LLFZ);
                            C93729aVZ.LJI(LIZJ().LLIIII);
                            C93729aVZ.LIZJ(LIZJ().LLIILII);
                            C93729aVZ.LJI(LIZJ().LLII);
                            C93729aVZ.LJI(LIZJ().LLFF);
                            TextView textView = LIZJ().LLILLJJLI;
                            o.LJIIIIZZ(textView, "binding.tvUpload");
                            TextPaint paint = textView.getPaint();
                            TextView textView2 = LIZJ().LLILLJJLI;
                            o.LJIIIIZZ(textView2, "binding.tvUpload");
                            if (paint.measureText(textView2.getText().toString()) >= C93410aQQ.LIZIZ(80)) {
                                C93729aVZ.LJI(LIZJ().LLIIIJ);
                                C93729aVZ.LIZJ(LIZJ().LLILLJJLI);
                            } else {
                                C93729aVZ.LIZJ(LIZJ().LLIIIJ);
                                C93729aVZ.LJI(LIZJ().LLILLJJLI);
                            }
                            if (!this.LIZIZ) {
                                this.LIZIZ = true;
                                ImageView imageView3 = LIZJ().LLIIIJ;
                                o.LJIIIIZZ(imageView3, "binding.ivUpload");
                                if (imageView3.getVisibility() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                StatisticReporter LIZ5 = C93670aUc.LIZ();
                                if (LIZ5 != null) {
                                    OSZ[] oszArr = new OSZ[2];
                                    if (z) {
                                        str = "icon";
                                    } else {
                                        str = "text";
                                    }
                                    oszArr[0] = new OSZ("button_style", str);
                                    oszArr[1] = new OSZ("is_ame_data", "1");
                                    LIZ5.onEvent("homepage_submit_effect_style", C113554cx.LJJL(oszArr));
                                }
                            }
                            LJI();
                            LJ();
                            LIZ(false);
                            c34k.element = true;
                        }
                    }
                }
            }
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZJ.invoke()), null, null, new C94901aoT(this, c34k, null), 3);
    }

    public final C94349afZ LIZJ() {
        return this.LIZLLL.invoke();
    }

    public final void LJ() {
        LinearLayout linearLayout = LIZJ().LLIIZ;
        o.LJIIIIZZ(linearLayout, "binding.previewSubmitContainer");
        linearLayout.setVisibility(8);
        C1AH c1ah = LIZJ().LJLL;
        o.LJIIIIZZ(c1ah, "binding.ckeMainNormalPreviewGroup");
        c1ah.setVisibility(8);
        C1AH c1ah2 = LIZJ().LJLLILLLL;
        o.LJIIIIZZ(c1ah2, "binding.ckeMainTemplatePreviewGroup");
        c1ah2.setVisibility(8);
        AbstractC93937aYv value = C93939aYx.LIZ().getRenderModeData().getValue();
        if (o.LJ(value, C94339afP.LIZ)) {
            LIZJ().LLFII.setBackgroundColor(0);
            ImageView imageView = LIZJ().LLFII;
            o.LJIIIIZZ(imageView, "binding.ivCamera");
            ImageView imageView2 = LIZJ().LLFII;
            o.LJIIIIZZ(imageView2, "binding.ivCamera");
            Context context = imageView2.getContext();
            o.LJIIIIZZ(context, "binding.ivCamera.context");
            imageView.setImageTintList(ColorStateList.valueOf(context.getResources().getColor(R.color.ael)));
            LIZJ().LLII.setBackgroundResource(R.drawable.dhl);
            ImageView imageView3 = LIZJ().LLII;
            o.LJIIIIZZ(imageView3, "binding.ivModel");
            ImageView imageView4 = LIZJ().LLFII;
            o.LJIIIIZZ(imageView4, "binding.ivCamera");
            Context context2 = imageView4.getContext();
            o.LJIIIIZZ(context2, "binding.ivCamera.context");
            imageView3.setImageTintList(ColorStateList.valueOf(context2.getResources().getColor(R.color.aek)));
            C93729aVZ.LIZJ(LIZJ().LLI);
            C93729aVZ.LJI(LIZJ().LLIIIILZ);
            return;
        }
        if (!(value instanceof C94503ai3) || !((C94503ai3) value).LIZ) {
            return;
        }
        LIZJ().LLFII.setBackgroundResource(R.drawable.dhl);
        ImageView imageView5 = LIZJ().LLFII;
        o.LJIIIIZZ(imageView5, "binding.ivCamera");
        ImageView imageView6 = LIZJ().LLFII;
        o.LJIIIIZZ(imageView6, "binding.ivCamera");
        Context context3 = imageView6.getContext();
        o.LJIIIIZZ(context3, "binding.ivCamera.context");
        imageView5.setImageTintList(ColorStateList.valueOf(context3.getResources().getColor(R.color.aek)));
        LIZJ().LLII.setBackgroundColor(0);
        ImageView imageView7 = LIZJ().LLII;
        o.LJIIIIZZ(imageView7, "binding.ivModel");
        ImageView imageView8 = LIZJ().LLFII;
        o.LJIIIIZZ(imageView8, "binding.ivCamera");
        Context context4 = imageView8.getContext();
        o.LJIIIIZZ(context4, "binding.ivCamera.context");
        imageView7.setImageTintList(ColorStateList.valueOf(context4.getResources().getColor(R.color.ael)));
        C93729aVZ.LJI(LIZJ().LLI);
        C93729aVZ.LIZJ(LIZJ().LLIIIILZ);
    }

    public final void LJI() {
        ConfigProvider LIZ = C93938aYw.LIZ();
        if (LIZ != null && LIZ.enableDefaultCamera()) {
            C93729aVZ.LJI(LIZJ().LLIILZL);
        } else {
            C93729aVZ.LIZJ(LIZJ().LLIILZL);
        }
    }

    public final void LIZ(boolean z) {
        int i;
        if (z) {
            i = R.drawable.dhj;
        } else {
            i = R.drawable.dhi;
        }
        LIZJ().LLIILZL.setBackgroundResource(i);
        LIZJ().LLIIIILZ.setBackgroundResource(i);
        LIZJ().LLI.setBackgroundResource(i);
        LIZJ().LLIIII.setBackgroundResource(i);
    }

    public final void LIZLLL(boolean z) {
        C94164aca c94164aca = LIZJ().LJLIL;
        o.LJIIIIZZ(c94164aca, "binding.root");
        Context context = c94164aca.getContext();
        C03510Bv.LIZIZ(LIZJ().LLF);
        if (z) {
            View view = LIZJ().LJLILLLLZI;
            o.LJIIIIZZ(view, "binding.addShadow");
            if (view.getVisibility() != 0) {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZJ.invoke()), null, null, new C94902aoU(this, null), 3);
            }
            View view2 = LIZJ().LJLILLLLZI;
            o.LJIIIIZZ(view2, "binding.addShadow");
            view2.setVisibility(0);
            C03510Bv.LIZLLL(C03820Da.LIZIZ(context, R.layout.dw2, LIZJ().LLF));
            View findViewById = LIZJ().LLF.findViewById(R.id.nlk);
            o.LJIIIIZZ(findViewById, "binding.flAdd.findViewBy…eator.main.R.id.add_text)");
            ((TextView) findViewById).setSelected(true);
            return;
        }
        View view3 = LIZJ().LJLILLLLZI;
        o.LJIIIIZZ(view3, "binding.addShadow");
        view3.setVisibility(8);
        C03510Bv.LIZLLL(C03820Da.LIZIZ(context, R.layout.dw1, LIZJ().LLF));
    }

    public final void LJFF(boolean z) {
        int i;
        int i2;
        int i3;
        MainLiveData<Boolean> effectHintSelectionShow;
        Boolean value;
        boolean z2;
        InterfaceC93941aYz interfaceC93941aYz;
        RelativeLayout relativeLayout = LIZJ().LLF;
        o.LJIIIIZZ(relativeLayout, "binding.flAdd");
        relativeLayout.setVisibility(4);
        RelativeLayout relativeLayout2 = LIZJ().LLILII;
        o.LJIIIIZZ(relativeLayout2, "binding.rlLayer");
        relativeLayout2.setVisibility(4);
        RelativeLayout relativeLayout3 = LIZJ().LLIL;
        o.LJIIIIZZ(relativeLayout3, "binding.rlController");
        relativeLayout3.setVisibility(4);
        C93729aVZ.LIZLLL(LIZJ().LLFZ);
        C93729aVZ.LJI(LIZJ().LJLLL);
        C93729aVZ.LIZLLL(LIZJ().LJLJL);
        C93729aVZ.LJI(LIZJ().LLILL);
        C93729aVZ.LIZJ(LIZJ().LLFF);
        C93729aVZ.LIZLLL(LIZJ().LLIIIZ);
        C93729aVZ.LJI(LIZJ().LJLLLLLL);
        LinearLayout linearLayout = LIZJ().LLIIZ;
        o.LJIIIIZZ(linearLayout, "binding.previewSubmitContainer");
        boolean z3 = !z;
        int i4 = 0;
        if (z3) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        C1AH c1ah = LIZJ().LJLL;
        o.LJIIIIZZ(c1ah, "binding.ckeMainNormalPreviewGroup");
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c1ah.setVisibility(i2);
        C1AH c1ah2 = LIZJ().LJLLILLLL;
        o.LJIIIIZZ(c1ah2, "binding.ckeMainTemplatePreviewGroup");
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        c1ah2.setVisibility(i3);
        MainImpl LIZ = C93932aYq.LIZ();
        if (LIZ != null && (effectHintSelectionShow = LIZ.getEffectHintSelectionShow()) != null && (value = effectHintSelectionShow.getValue()) != null) {
            if (value.booleanValue() && (interfaceC93941aYz = (InterfaceC93941aYz) C93971aZT.LIZ().LIZ(InterfaceC93941aYz.class)) != null && interfaceC93941aYz.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            TextView textView = LIZJ().LLFFF;
            o.LJIIIIZZ(textView, "binding.hintSelection");
            if (!z2 || z) {
                i4 = 8;
            }
            textView.setVisibility(i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C93926aYk(InterfaceC65784Pro<? extends LifecycleOwner> interfaceC65784Pro, InterfaceC65784Pro<C94349afZ> interfaceC65784Pro2, InterfaceC65784Pro<Boolean> interfaceC65784Pro3) {
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = interfaceC65784Pro2;
        this.LJ = interfaceC65784Pro3;
    }
}
