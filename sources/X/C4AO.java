package X;

import Y.IDCSpanS0S1100000_1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.navi.NaviCreationSignal;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4AO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AO extends AnonymousClass460<GifContent> {
    public static final int LLIIJLIL = (int) KL2.LIZJ(EF7.LIZIZ(), 112.0f);
    public static final int LLIIL = (int) KL2.LIZJ(EF7.LIZIZ(), 300.0f);
    public static final int LLIILII = (int) KL2.LIZJ(EF7.LIZIZ(), 180.0f);
    public final View LLIIIL;
    public final C62846OlW LLIIIZ;
    public final ConstraintLayout LLIIJI;

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void onAttachedToWindow() {
        long j;
        super.onAttachedToWindow();
        C109544Rq c109544Rq = this.LJZI;
        if (c109544Rq != null) {
            if (o.LJ(c109544Rq.getExt().get("a:src"), "action_bar:sticker")) {
                GifContent gifContent = (GifContent) this.LLIIIILZ;
                if (gifContent != null) {
                    j = gifContent.getImageId();
                } else {
                    j = 0;
                }
                C4FC.LIZ(j, new C105034Ah(j, false, new AqS167S0100000_1(this, 257)));
                return;
            }
            s0(null);
        }
    }

    public final void s0(UrlModel urlModel) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        String str3;
        UrlModel urlModel2 = urlModel;
        int i6 = 0;
        if (C4LS.LIZIZ()) {
            this.LLIIJI.setVisibility(0);
            this.LLIIIZ.setVisibility(8);
            return;
        }
        this.LLIIJI.setVisibility(8);
        this.LLIIIZ.setVisibility(0);
        UrlModel urlModel3 = null;
        if (urlModel2 == null) {
            GifContent gifContent = (GifContent) this.LLIIIILZ;
            if (gifContent != null) {
                urlModel2 = gifContent.getLocalUrl();
            } else {
                urlModel2 = null;
            }
        }
        GifContent gifContent2 = (GifContent) this.LLIIIILZ;
        int i7 = -1;
        if (gifContent2 != null) {
            i = gifContent2.getHeight();
        } else {
            i = -1;
        }
        GifContent gifContent3 = (GifContent) this.LLIIIILZ;
        if (gifContent3 != null) {
            i7 = gifContent3.getWidth();
        }
        if (i <= 0 || i7 <= 0) {
            i2 = 0;
            i3 = 0;
        } else if (i7 >= i) {
            i2 = LLIIJLIL;
            i3 = (i2 * i) / i7;
        } else {
            i3 = LLIIJLIL;
            i2 = (i3 * i7) / i;
        }
        GifContent gifContent4 = (GifContent) this.LLIIIILZ;
        if (gifContent4 != null) {
            str = gifContent4.getImageType();
        } else {
            str = null;
        }
        if (C60903NvH.LJIJI(str)) {
            i2 = LLIILII;
            i5 = (i * i2) / i7;
            int i8 = LLIIL;
            if (i5 > i8) {
                i5 = i8;
            }
            this.LLIIIZ.getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
            i4 = i2;
        } else {
            i4 = i2;
            i5 = i3;
        }
        ViewGroup.LayoutParams layoutParams = this.LLIIIZ.getLayoutParams();
        if (i2 < 0) {
            i2 = 0;
        }
        layoutParams.width = i2;
        if (i5 >= 0) {
            i6 = i5;
        }
        layoutParams.height = i6;
        this.LLIIIZ.setLayoutParams(layoutParams);
        GifContent gifContent5 = (GifContent) this.LLIIIILZ;
        if (gifContent5 != null) {
            str2 = gifContent5.getImageType();
        } else {
            str2 = null;
        }
        if (!C60903NvH.LJIJI(str2)) {
            GifContent gifContent6 = (GifContent) this.LLIIIILZ;
            if (gifContent6 != null) {
                str3 = gifContent6.getImageType();
            } else {
                str3 = null;
            }
            if (!C60903NvH.LJIJJLI(str3)) {
                if (urlModel2 == null) {
                    C62846OlW c62846OlW = this.LLIIIZ;
                    GifContent gifContent7 = (GifContent) this.LLIIIILZ;
                    if (gifContent7 != null) {
                        urlModel3 = gifContent7.getUrl();
                    }
                    C4AS.LJII(c62846OlW, urlModel3, "EmojiViewHolder", null, null, i4, i5, 408);
                    return;
                }
                C4AS.LJII(this.LLIIIZ, urlModel2, "EmojiViewHolder", null, null, i4, i5, 408);
                return;
            }
        }
        if (urlModel2 == null) {
            C62846OlW c62846OlW2 = this.LLIIIZ;
            GifContent gifContent8 = (GifContent) this.LLIIIILZ;
            if (gifContent8 != null) {
                urlModel3 = gifContent8.getUrl();
            }
            C4AS.LIZIZ(c62846OlW2, urlModel3, "EmojiViewHolder", i4, i5, 0, 0, null, 480);
            return;
        }
        C4AS.LIZIZ(this.LLIIIZ, urlModel2, "EmojiViewHolder", i4, i5, 0, 0, null, 480);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4AO(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.hpc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.picture_iv)");
        this.LLIIIZ = (C62846OlW) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.hr4);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.placeholder_container)");
        this.LLIIJI = (ConstraintLayout) findViewById3;
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        V92 hierarchy;
        o.LJIIIZ(msg, "msg");
        if (C4LS.LIZIZ()) {
            Context context = this.LLIIIZ.getContext();
            o.LJIIIIZZ(context, "pictureIv.context");
            Integer LJI = C79045V0n.LJI(R.attr.cv, context);
            if (LJI != null) {
                int intValue = LJI.intValue();
                View view = this.LLIIIL;
                GradientDrawable gradientDrawable = new GradientDrawable();
                C77413UZt.LJFF(gradientDrawable, new C49V(c49v.LIZ, c49v.LIZIZ, new C48E(intValue)));
                view.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        Context context2 = this.LLIIIZ.getContext();
        o.LJIIIIZZ(context2, "pictureIv.context");
        Integer LJI2 = C79045V0n.LJI(C49R.LIZ.LIZLLL, context2);
        if (LJI2 != null) {
            this.LLIIIZ.setBackgroundColor(LJI2.intValue());
        }
        CONTENT content = this.LLIIIILZ;
        boolean z = true;
        if (content == 0 || (content.type != 502 && content.type != 503 && content.type != 505)) {
            z = false;
        }
        if (z) {
            C4AH c4ah = c49v.LIZ;
            if (c4ah != null) {
                Context context3 = this.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                V8L LJJJI = g0.LJJJI(c4ah, context3);
                if (LJJJI == null || (hierarchy = this.LLIIIZ.getHierarchy()) == null) {
                    return;
                }
                hierarchy.LJIL(LJJJI);
                return;
            }
            return;
        }
        V92 hierarchy2 = this.LLIIIZ.getHierarchy();
        if (hierarchy2 == null) {
            return;
        }
        hierarchy2.LJIL(null);
    }

    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, GifContent gifContent, int i) {
        boolean z;
        C109544Rq c109544Rq2;
        java.util.Map<String, String> localExt;
        Integer num;
        final String str;
        o.LJIIIZ(msg, "msg");
        CONTENT content = this.LLIIIILZ;
        if (content != 0 && content.type == 500) {
            z = true;
        } else {
            z = false;
        }
        ForegroundColorSpan foregroundColorSpan = null;
        if (z || (content != 0 && content.type == 501)) {
            this.LLIIIZ.getHierarchy().LJIILL(null, 1);
        } else {
            V92 hierarchy = this.LLIIIZ.getHierarchy();
            C78714Uus c78714Uus = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
            hierarchy.LJIJI(R.drawable.bjo, c78714Uus);
            V92 hierarchy2 = this.LLIIIZ.getHierarchy();
            hierarchy2.LJIILL(hierarchy2.LIZIZ.getDrawable(R.drawable.bjo), 5);
            hierarchy2.LJIIL(5).LJIIZILJ(c78714Uus);
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 10);
        }
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        TuxTextView LIZ = this.LJLL.LIZ();
        if (LIZ != null) {
            TuxTextView tuxTextView = LIZ;
            boolean LIZ2 = C4AX.LIZ();
            C64962gm LIZ3 = C48841JEv.LIZ(C78613UtF.LIZJ);
            NaviCreationSignal.SingleLiveData signal = NaviCreationSignal.LIZ;
            o.LJIIIZ(signal, "signal");
            if (!C4LS.LIZ() && LIZ2 && msg.getLocalExt().containsKey("show_navi_tip") && !msg.getLocalExt().containsKey("a:sticker_store_inline")) {
                XKX.LIZLLL(LIZ3, null, null, new C91983jG(msg, context, signal, tuxTextView, null), 3);
            }
            if (C88963eO.LIZLLL() && !C88963eO.LIZJ() && (c109544Rq2 = this.LJZI) != null && (localExt = c109544Rq2.getLocalExt()) != null && localExt.containsKey("a:sticker_store_inline")) {
                C109544Rq c109544Rq3 = this.LJZI;
                if (c109544Rq3 != null) {
                    num = Integer.valueOf(c109544Rq3.getConversationType());
                } else {
                    num = null;
                }
                int i2 = AbstractC63505Ow9.LIZIZ;
                if (num == null || num.intValue() != i2) {
                    str = "private";
                } else {
                    str = "group";
                }
                TuxTextView LIZ4 = this.LJLL.LIZ();
                if (LIZ4 != null) {
                    Context context2 = LIZ4.getContext();
                    o.LJIIIIZZ(context2, "noticeTv.context");
                    IDCSpanS0S1100000_1 iDCSpanS0S1100000_1 = new IDCSpanS0S1100000_1(this, str, 0);
                    String LIZ5 = C29822Bn8.LIZ(context2, R.string.haw, "context.resources.getStr…chat_findMoreSticker_btn)");
                    String string = context2.getResources().getString(R.string.hav, LIZ5);
                    o.LJIIIIZZ(string, "context.resources.getStr…reSticker, clickableText)");
                    int LJJLIIIJL = s.LJJLIIIJL(string, LIZ5, 0, false, 6);
                    int length = LIZ5.length() + LJJLIIIJL;
                    SpannableString spannableString = new SpannableString(string);
                    spannableString.setSpan(iDCSpanS0S1100000_1, LJJLIIIJL, length, 18);
                    spannableString.setSpan(new T5U(62, false), LJJLIIIJL, length, 18);
                    Integer LJI = C79045V0n.LJI(R.attr.gu, context2);
                    if (LJI != null) {
                        foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
                    }
                    spannableString.setSpan(foregroundColorSpan, LJJLIIIJL, length, 18);
                    LIZ4.setText(spannableString);
                    LIZ4.setMovementMethod(LinkMovementMethod.getInstance());
                    LIZ4.setVisibility(0);
                    C12460eI.LIZLLL(LIZ4, new AbstractC13940gg() { // from class: X.4AQ
                        public final C4AW LJ = C4AW.LJLIL;

                        @Override // X.AbstractC13940gg
                        public final java.util.Map LJFF() {
                            return C113554cx.LJJJLZIJ(new OSZ("enter_from", "chat"), new OSZ("chat_type", str), new OSZ("platform", "internal"), new OSZ(WM7.SCENE_SERVICE, "sticker_store"));
                        }

                        @Override // X.AbstractC13940gg
                        public final InterfaceC65784Pro<String> LIZ() {
                            return this.LJ;
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
