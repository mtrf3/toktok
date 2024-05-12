package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OG extends C6PN<TextStickerModel> {
    public C6OF LJII;
    public final InterfaceC159886Pg LJIIIIZZ;
    public final C6QI LJIIIZ;
    public final List<C6QO> LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;

    @Override // X.C6PN
    public final Object LIZIZ() {
        C6OF c6of = this.LJII;
        if (c6of == null) {
            return null;
        }
        return c6of.getApi();
    }

    @Override // X.C6PN
    public final EnumC157656Gr LIZLLL() {
        return EnumC157656Gr.TEXT;
    }

    @Override // X.C6PN
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        int containerWidth;
        int containerHeight;
        boolean z;
        o.LJIIIZ(stickerModel, "stickerModel");
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        BaseStickerModel baseSticker = textStickerModel.getBaseSticker();
        if (!C78880UxY.LJJLIIIIJ(textStickerModel.getBaseStickerModel())) {
            C78880UxY.LJL(textStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LIZLLL());
        }
        float centerX = baseSticker.getCenterX();
        float centerY = baseSticker.getCenterY();
        if (baseSticker.getCenterX() == 0.0f || baseSticker.getCenterY() == 0.0f) {
            centerX = this.LIZIZ.getWidth() / 2.0f;
            centerY = this.LIZIZ.getHeight() / 2.0f;
        }
        BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
        if (baseSticker.getContainerWidth() == 0) {
            containerWidth = this.LIZIZ.getWidth();
        } else {
            containerWidth = baseSticker.getContainerWidth();
        }
        if (baseSticker.getContainerHeight() == 0) {
            containerHeight = this.LIZIZ.getHeight();
        } else {
            containerHeight = baseSticker.getContainerHeight();
        }
        if (textStickerModel.getBaseSticker().getStartTime() <= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, centerX, centerY, 0, 0, 0, 0, containerWidth, containerHeight, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, z, 0.0f, -1073748066, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
    }

    @Override // X.C6PN
    public final C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner) {
        return new C6OW(this.LIZ, (TextStickerModel) stickerModel, this.LIZIZ, c159636Oh, lifecycleOwner, this.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6PN
    public final void LJ(final C6QO c6qo, final C6PX c6px, String createEditEnterMethod, final InterfaceC88472Yns editDone) {
        StickerModel textStickerModel;
        TTSVoiceModel tTSVoiceModel;
        String str;
        TTSModel tTSModel;
        o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
        o.LJIIIZ(editDone, "editDone");
        if (c6qo == null || (textStickerModel = c6qo.LIZ()) == null) {
            float f = 0.0f;
            textStickerModel = new TextStickerModel(new BaseStickerModel(0, 0 == true ? 1 : 0, EnumC157656Gr.TEXT, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, f, f, f, f, f, f, f, f, f, f, 0 == true ? 1 : 0, f, f, 0 == true ? 1 : 0, f, -5, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262142, 0 == true ? 1 : 0);
        }
        TextStickerModel textStickerModel2 = (TextStickerModel) textStickerModel;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        if (u.LJIL(textStickerModel2)) {
            C6OE c6oe = (C6OE) this.LJIIL.getValue();
            if (c6oe != null) {
                tTSVoiceModel = c6oe.LJII();
            } else {
                tTSVoiceModel = null;
            }
            EnumC139385dW enumC139385dW = EnumC139385dW.NONE;
            if (u.LJIJJLI(textStickerModel2)) {
                str = textStickerModel2.getTextStr();
            } else {
                str = "";
            }
            if (tTSVoiceModel != null) {
                long j = 0;
                tTSModel = new TTSModel(false, 0 == true ? 1 : 0, str2, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, tTSVoiceModel.getSpeakerName(), 0 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, 0 == true ? 1 : 0, tTSVoiceModel.getEffectId(), objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 33552351, objArr == true ? 1 : 0);
            } else {
                tTSModel = null;
            }
            textStickerModel2 = TextStickerModel.copy$default(textStickerModel2, null, null, str, 0, 0, 0, 0.0f, null, false, false, false, tTSModel, null, null, enumC139385dW, null, null, false, 243707, null);
        }
        if (textStickerModel2.getTextStr().length() == 0 || textStickerModel2.getBaseStickerModel().getCenterX() == 0.0f || textStickerModel2.getBaseStickerModel().getCenterY() == 0.0f) {
            textStickerModel2 = TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, (this.LIZIZ.getRight() + this.LIZIZ.getLeft()) / 2.0f, (this.LIZIZ.getBottom() + this.LIZIZ.getTop()) / 2.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -97, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
        }
        C6OF c6of = this.LJII;
        if (c6of == null) {
            this.LJII = new C6OF(this.LIZ, this.LJFF);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C6OF c6of2 = this.LJII;
            if (c6of2 != null) {
                frameLayout.addView(c6of2, layoutParams);
                C6OF c6of3 = this.LJII;
                if (c6of3 != null) {
                    c6of3.LJIIJJI(textStickerModel2, (C6O5) this.LJIIJJI.getValue(), this.LIZLLL);
                    C6OF c6of4 = this.LJII;
                    if (c6of4 != null) {
                        int left = this.LIZIZ.getLeft();
                        int right = this.LIZJ.getRight() - this.LIZIZ.getRight();
                        FrameLayout frameLayout2 = c6of4.LJLLL;
                        if (frameLayout2 != null) {
                            int paddingTop = frameLayout2.getPaddingTop();
                            FrameLayout frameLayout3 = c6of4.LJLLL;
                            if (frameLayout3 != null) {
                                frameLayout2.setPadding(left, paddingTop, right, frameLayout3.getPaddingRight());
                                FrameLayout frameLayout4 = c6of4.LJZL;
                                if (frameLayout4 != null) {
                                    int paddingTop2 = frameLayout4.getPaddingTop();
                                    FrameLayout frameLayout5 = c6of4.LJZL;
                                    if (frameLayout5 != null) {
                                        frameLayout4.setPadding(left, paddingTop2, right, frameLayout5.getPaddingRight());
                                    } else {
                                        o.LJIJI("animStickerContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("animStickerContainer");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("textStickerContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("textStickerContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("textStickerEditView");
                        throw null;
                    }
                } else {
                    o.LJIJI("textStickerEditView");
                    throw null;
                }
            } else {
                o.LJIJI("textStickerEditView");
                throw null;
            }
        } else {
            c6of.LJIILIIL(textStickerModel2);
        }
        C6OF c6of5 = this.LJII;
        if (c6of5 != null) {
            c6of5.setStickerEditListener(new C6Q4() { // from class: X.6OP
                @Override // X.C6Q4
                public final void LJ() {
                }

                @Override // X.C6Q4
                public final void LJFF() {
                }

                @Override // X.C6Q4
                public final void LIZLLL() {
                    C6QO c6qo2 = c6qo;
                    if (c6qo2 != null) {
                        c6qo2.LJIIIZ(false, c6qo2.LJIJJ());
                        c6qo2.setVisible(false);
                    }
                }

                @Override // X.C6Q4
                public final void LIZIZ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                    C6Q4 c6q4 = c6px;
                    if (c6q4 != null) {
                        c6q4.LIZIZ(stickerModel);
                    }
                }

                @Override // X.C6Q4
                public final void LIZJ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.C6Q4
                public final void LIZ(StickerModel stickerModel, boolean z) {
                    C6OX c6ox;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    if (!(stickerModel instanceof TextStickerModel)) {
                        return;
                    }
                    C6Q4 c6q4 = c6px;
                    if (c6q4 != null) {
                        c6q4.LIZ(stickerModel, z);
                    }
                    editDone.invoke(stickerModel);
                    C6QO c6qo2 = c6qo;
                    if ((c6qo2 instanceof C6OW) && (c6ox = (C6OX) c6qo2) != null) {
                        c6ox.LJIIIZ(true, c6ox.LJIJJ());
                    }
                }
            });
            C6OF c6of6 = this.LJII;
            if (c6of6 != null) {
                c6of6.LJIIL();
                return;
            } else {
                o.LJIJI("textStickerEditView");
                throw null;
            }
        }
        o.LJIJI("textStickerEditView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OG(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, C159816Oz stickerConfig, C160056Px stickerObjectContainer) {
        super(context, stickerContainer, stickerHigherContainer, lifecycleOwner, stickerConfig, stickerObjectContainer);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJIIIIZZ = (InterfaceC159886Pg) stickerObjectContainer.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class));
        C6QI c6qi = (C6QI) stickerObjectContainer.LIZIZ(C65352Pkq.LIZ(C6QI.class));
        this.LJIIIZ = c6qi;
        this.LJIIJ = C38891fp.LJIIZILJ(stickerObjectContainer);
        this.LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 722));
        this.LJIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 723));
        C6QA LIZ = c6qi.LIZ();
        InterfaceC156876Dr interfaceC156876Dr = new InterfaceC156876Dr() { // from class: X.6Dq
            @Override // X.InterfaceC156876Dr
            public final EnumC157656Gr getStickerType() {
                return EnumC157656Gr.TEXT;
            }

            @Override // X.InterfaceC156876Dr
            public final List<C6NN> LIZ(int i) {
                AnonymousClass635 anonymousClass635;
                C6QO c6qo;
                StickerModel stickerModel;
                TextStickerModel textStickerModel;
                boolean z;
                InterfaceC65784Pro<Boolean> interfaceC65784Pro;
                C6NN c6nn;
                InterfaceC65784Pro<Boolean> interfaceC65784Pro2;
                C6OG c6og = C6OG.this;
                Iterator<C6QO> it = c6og.LJIIJ.iterator();
                while (true) {
                    anonymousClass635 = null;
                    if (it.hasNext()) {
                        c6qo = it.next();
                        if (c6qo.LJJLIIIJLJLI() == i) {
                            break;
                        }
                    } else {
                        c6qo = null;
                        break;
                    }
                }
                C6QO c6qo2 = c6qo;
                if (c6qo2 != null) {
                    stickerModel = c6qo2.LIZ();
                } else {
                    stickerModel = null;
                }
                if (!(stickerModel instanceof TextStickerModel) || (textStickerModel = (TextStickerModel) stickerModel) == null) {
                    return C61878OQg.INSTANCE;
                }
                C6OE c6oe = (C6OE) c6og.LJIIL.getValue();
                if (c6oe != null) {
                    anonymousClass635 = c6oe.LJIIIIZZ();
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (u.LJIILLIIL(textStickerModel) && C43865HJl.LIZ()) {
                    String string = c6og.LIZ.getString(R.string.fj);
                    o.LJIIIIZZ(string, "context.getString(R.stri…e_shuffleMemeSection_btn)");
                    linkedHashSet.add(new C6NN(6, R.drawable.b4u, string, 8));
                }
                C6OE c6oe2 = (C6OE) c6og.LJIIL.getValue();
                if (c6oe2 != null && c6oe2.LJFF()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Iterator it2 = C47261Igj.LJII(2, 1).iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(c6og.LJIIIZ.LIZ().LJIIIIZZ(((Number) it2.next()).intValue()));
                    }
                    return ORZ.LLJI(linkedHashSet);
                }
                if (u.LJIJ(textStickerModel)) {
                    if (anonymousClass635 == null || (interfaceC65784Pro2 = anonymousClass635.LJIILLIIL) == null || !interfaceC65784Pro2.invoke().booleanValue()) {
                        String string2 = c6og.LIZ.getString(R.string.bwv);
                        o.LJIIIIZZ(string2, "context.getString(R.string.auto_caption_edit)");
                        linkedHashSet.add(new C6NN(5, R.drawable.t9, string2, 8));
                    }
                    linkedHashSet.add(c6og.LJIIIZ.LIZ().LJIIIIZZ(1));
                    return ORZ.LLJI(linkedHashSet);
                }
                if (anonymousClass635 != null && (interfaceC65784Pro = anonymousClass635.LIZJ) != null && interfaceC65784Pro.invoke().booleanValue()) {
                    if (anonymousClass635.LIZLLL && u.LJIILL(textStickerModel)) {
                        String string3 = c6og.LIZ.getString(R.string.s6l);
                        o.LJIIIIZZ(string3, "context.getString(R.string.text_reading_2nd_9)");
                        c6nn = new C6NN(string3, 4, R.drawable.b9m, C156836Dn.LJLIL);
                    } else {
                        boolean z2 = anonymousClass635.LIZLLL;
                        if (z2 && anonymousClass635.LJIILL) {
                            String string4 = c6og.LIZ.getString(R.string.s6q);
                            o.LJIIIIZZ(string4, "context.getString(R.stri….text_test_menuItem_name)");
                            c6nn = new C6NN(string4, 4, R.drawable.b9n, C156846Do.LJLIL);
                        } else if (z2) {
                            String string5 = c6og.LIZ.getString(R.string.e46);
                            o.LJIIIIZZ(string5, "context.getString(R.stri…it_text_reading_entrance)");
                            c6nn = new C6NN(string5, 4, R.drawable.b9n, C156856Dp.LJLIL);
                        } else if (u.LJIILL(textStickerModel)) {
                            String string6 = c6og.LIZ.getString(R.string.e47);
                            o.LJIIIIZZ(string6, "context.getString(R.stri…_reading_entrance_cancel)");
                            c6nn = new C6NN(string6, 4, R.drawable.ta, C6DG.LJLIL);
                        } else {
                            String string7 = c6og.LIZ.getString(R.string.e46);
                            o.LJIIIIZZ(string7, "context.getString(R.stri…it_text_reading_entrance)");
                            c6nn = new C6NN(string7, 4, R.drawable.ta, C6DH.LJLIL);
                        }
                    }
                    linkedHashSet.add(c6nn);
                }
                if (!u.LJIILLIIL(textStickerModel) || !C43865HJl.LIZ()) {
                    linkedHashSet.add(c6og.LJIIIZ.LIZ().LJIIIIZZ(3));
                }
                linkedHashSet.add(c6og.LJIIIZ.LIZ().LJIIIIZZ(2));
                return ORZ.LLJI(linkedHashSet);
            }
        };
        LIZ.getClass();
        ((ArrayList) LIZ.LJIIIIZZ).add(interfaceC156876Dr);
    }
}
