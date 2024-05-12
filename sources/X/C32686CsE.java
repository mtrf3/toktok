package X;

import Y.ARunnableS41S0100000_5;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CsE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32686CsE extends AbstractC32677Cs5 {
    public C47121t6 LJZI;
    public ImageView LJZL;
    public ImageView LL;
    public LinearLayout LLD;
    public boolean LLF;

    @Override // X.AbstractC32677Cs5
    public final boolean N() {
        Object obj;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        Object obj2 = null;
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Gift)) {
            return false;
        }
        if (abstractC32698CsQ != null) {
            obj2 = abstractC32698CsQ.LIZIZ;
        }
        o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
        ImageModel imageModel = ((Gift) obj2).previewImage;
        if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC32677Cs5
    public final void P() {
        Object obj;
        Gift gift;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJLJ;
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
            ImageModel imageModel = gift.previewImage;
            if (N()) {
                long j = gift.id;
                this.LLF = true;
                ImageView imageView = this.LL;
                if (imageView != null) {
                    C15640jQ.LIZJ(-1, -1, R.drawable.d1p, imageView, imageModel, new C32714Csg(j, this), true);
                } else {
                    o.LJIJI("dynamicView");
                    throw null;
                }
            } else {
                ImageModel imageModel2 = gift.image;
                ImageView imageView2 = this.LL;
                if (imageView2 != null) {
                    C15640jQ.LIZLLL(imageView2, imageModel2);
                } else {
                    o.LJIJI("dynamicView");
                    throw null;
                }
            }
        }
        super.P();
    }

    @Override // X.AbstractC32677Cs5
    public final void U() {
        C47061t0 c47061t0;
        super.U();
        ImageView imageView = this.LL;
        if (imageView != null) {
            C29306Beo.LJJLJLI(imageView);
            if ((!N() || !this.LLF) && (c47061t0 = this.LJLJJL) != null) {
                c47061t0.setVisibility(8);
            }
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            C47121t6 c47121t62 = this.LJZI;
            if (c47121t62 != null) {
                c47121t62.setTextColor(C15380j0.LIZIZ(R.color.bc));
                LinearLayout linearLayout = this.LLD;
                if (linearLayout != null) {
                    C29306Beo.LJI(linearLayout);
                    return;
                } else {
                    o.LJIJI("giftLockAndName");
                    throw null;
                }
            }
            o.LJIJI("giftCoin");
            throw null;
        }
        o.LJIJI("dynamicView");
        throw null;
    }

    @Override // X.AbstractC32677Cs5
    public final void X() {
        super.X();
        C47061t0 c47061t0 = this.LJLJJL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        ImageView imageView = this.LL;
        if (imageView != null) {
            C29306Beo.LJI(imageView);
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            C47121t6 c47121t62 = this.LJZI;
            if (c47121t62 != null) {
                c47121t62.setTextColor(C15380j0.LIZIZ(R.color.be));
                LinearLayout linearLayout = this.LLD;
                if (linearLayout != null) {
                    C29306Beo.LJJLJLI(linearLayout);
                    return;
                } else {
                    o.LJIJI("giftLockAndName");
                    throw null;
                }
            }
            o.LJIJI("giftCoin");
            throw null;
        }
        o.LJIJI("dynamicView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32686CsE(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = this.LJLIL.findViewById(R.id.dsp);
        o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.gift_dynamic_preview)");
        this.LL = (ImageView) findViewById;
        View findViewById2 = this.LJLIL.findViewById(R.id.gzf);
        o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.new_gift_coin)");
        this.LJZI = (C47121t6) findViewById2;
        View findViewById3 = this.LJLIL.findViewById(R.id.bgf);
        o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R.id.coin_icon)");
        this.LJZL = (ImageView) findViewById3;
        View findViewById4 = this.LJLIL.findViewById(R.id.dtn);
        o.LJIIIIZZ(findViewById4, "mRootView.findViewById(R.id.gift_lock_and_name)");
        this.LLD = (LinearLayout) findViewById4;
        C47121t6 c47121t6 = this.LJZI;
        if (c47121t6 != null) {
            c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        } else {
            o.LJIJI("giftCoin");
            throw null;
        }
    }

    @Override // X.AbstractC32677Cs5
    public final void L(AbstractC32698CsQ<?> abstractC32698CsQ, DataChannel dataChannel, int i) {
        AbstractC32698CsQ<?> abstractC32698CsQ2;
        AbstractC32698CsQ<?> abstractC32698CsQ3;
        AbstractC32756CtM abstractC32756CtM;
        C47061t0 c47061t0;
        this.LLF = false;
        super.L(abstractC32698CsQ, dataChannel, i);
        ImageView imageView = this.LL;
        Integer num = null;
        if (imageView != null) {
            C29306Beo.LJI(imageView);
            InterfaceC32671Crz interfaceC32671Crz = this.LJLJLLL;
            if (interfaceC32671Crz != null) {
                abstractC32698CsQ2 = ((AbstractC32682CsA) interfaceC32671Crz).LJLIL;
            } else {
                abstractC32698CsQ2 = null;
            }
            if (abstractC32698CsQ2 == abstractC32698CsQ) {
                C47061t0 c47061t02 = this.LJLJJL;
                if (c47061t02 != null) {
                    c47061t02.setVisibility(8);
                }
                ImageView imageView2 = this.LL;
                if (imageView2 != null) {
                    C29306Beo.LJJLJLI(imageView2);
                } else {
                    o.LJIJI("dynamicView");
                    throw null;
                }
            }
            InterfaceC32671Crz interfaceC32671Crz2 = this.LJLJLLL;
            if (interfaceC32671Crz2 != null) {
                AbstractC32682CsA abstractC32682CsA = (AbstractC32682CsA) interfaceC32671Crz2;
                if (abstractC32682CsA.LJLJJLL == abstractC32698CsQ.LIZJ()) {
                    abstractC32682CsA.LJLJJLL = 0L;
                    if (!N() && (c47061t0 = this.LJLJJL) != null) {
                        c47061t0.postDelayed(new ARunnableS41S0100000_5(this, 288), 50L);
                    }
                }
            }
            if (this.LJLJJI != null) {
                LinearLayout linearLayout = this.LLD;
                if (linearLayout != null) {
                    C29306Beo.LJJLJLI(linearLayout);
                } else {
                    o.LJIJI("giftLockAndName");
                    throw null;
                }
            }
            InterfaceC32671Crz interfaceC32671Crz3 = this.LJLJLLL;
            if (interfaceC32671Crz3 != null) {
                abstractC32698CsQ3 = ((AbstractC32682CsA) interfaceC32671Crz3).LJLIL;
            } else {
                abstractC32698CsQ3 = null;
            }
            if (abstractC32698CsQ3 == abstractC32698CsQ && this.LJLJJI != null) {
                LinearLayout linearLayout2 = this.LLD;
                if (linearLayout2 != null) {
                    C29306Beo.LJI(linearLayout2);
                } else {
                    o.LJIJI("giftLockAndName");
                    throw null;
                }
            }
            AbstractC32698CsQ<?> abstractC32698CsQ4 = this.LJLJLJ;
            if (abstractC32698CsQ4 instanceof C32739Ct5) {
                abstractC32756CtM = (AbstractC32756CtM) abstractC32698CsQ4;
            } else {
                abstractC32756CtM = null;
            }
            ImageView imageView3 = this.LJZL;
            if (imageView3 != null) {
                C29306Beo.LJJLJLI(imageView3);
                C47121t6 c47121t6 = this.LJZI;
                if (c47121t6 != null) {
                    Object[] objArr = new Object[1];
                    if (abstractC32756CtM != null) {
                        num = Integer.valueOf(abstractC32756CtM.LJIILIIL());
                    }
                    objArr[0] = String.valueOf(num);
                    c47121t6.setText(C15380j0.LJIILL(R.string.stq, objArr));
                    return;
                }
                o.LJIJI("giftCoin");
                throw null;
            }
            o.LJIJI("coinIcon");
            throw null;
        }
        o.LJIJI("dynamicView");
        throw null;
    }
}
