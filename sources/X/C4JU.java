package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4JU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JU extends AnonymousClass460<CommentContent> {
    public final View LLIIIL;
    public final C62846OlW LLIIIZ;
    public final TuxTextView LLIIJI;
    public Aweme LLIIJLIL;
    public final C64962gm LLIIL;

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        C16880lQ.LJJJJJL(this.LLIIIZ, new ACListenerS36S0200000_1(onClickListener, this, 27));
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(new ACListenerS36S0200000_1(onClickListener, this, 28));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4JU(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIL = C48841JEv.LIZ(C78613UtF.LIZJ);
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.hpc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.picture_iv)");
        this.LLIIIZ = (C62846OlW) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.title_tv)");
        this.LLIIJI = (TuxTextView) findViewById3;
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        View view = this.LLIIIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v);
        view.setBackground(gradientDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.CharSequence, X.4i3] */
    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, CommentContent commentContent, int i) {
        String str;
        String str2;
        boolean z;
        UrlModel urlModel;
        final String str3;
        final String str4;
        UrlModel urlModel2;
        final String str5;
        final int i2;
        String awemeId;
        UrlModel urlModel3;
        CommentContent commentContent2 = commentContent;
        o.LJIIIZ(msg, "msg");
        C62846OlW c62846OlW = this.LLIIIZ;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_bubble_ellipsis_right;
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = AnonymousClass391.LIZ(19.5d);
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt.LJII = C7MY.LIZIZ(42);
        c110614Vt.LJI = C7MY.LIZIZ(56);
        c62846OlW.setImageDrawable(new LayerDrawable(new Drawable[]{LIZ, c110614Vt.LIZ(context)}));
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 14);
        }
        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
        if (anonymousClass4702 != null) {
            anonymousClass4702.LIZIZ(134217728, msg);
        }
        AnonymousClass470 anonymousClass4703 = this.LJLJJI;
        if (anonymousClass4703 != null) {
            anonymousClass4703.LIZIZ(100663296, commentContent2);
        }
        this.LLIIIZ.setTag(50331648, 51);
        this.LLIIIZ.setTag(134217728, msg);
        this.LLIIIZ.setTag(100663296, commentContent2);
        java.util.Map<String, String> localExt = msg.getLocalExt();
        if (localExt != null) {
            str = localExt.get("access_status");
        } else {
            str = null;
        }
        java.util.Map<String, String> localExt2 = msg.getLocalExt();
        if (localExt2 != null) {
            str2 = localExt2.get("reason_string");
        } else {
            str2 = null;
        }
        if (str == null || str.length() == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str6 = "";
        if (z) {
            str2 = "";
        }
        Integer LJJIL = C38350F3i.LJJIL(str);
        if (LJJIL == null || LJJIL.intValue() != 0) {
            if (LJJIL == null || (LJJIL.intValue() != 5 && LJJIL.intValue() != 6)) {
                TuxTextView tuxTextView = this.LLIIJI;
                if (tuxTextView != null) {
                    tuxTextView.setText(str2);
                }
            } else {
                C62846OlW c62846OlW2 = this.LLIIIZ;
                CommentContent commentContent3 = (CommentContent) this.LLIIIILZ;
                if (commentContent3 != null) {
                    urlModel3 = commentContent3.getCoverUrl();
                } else {
                    urlModel3 = null;
                }
                C4AS.LJII(c62846OlW2, urlModel3, "Comment ViewHolder", null, null, 0, 0, 504);
                TuxTextView tuxTextView2 = this.LLIIJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(str2);
                }
            }
        } else {
            C62846OlW c62846OlW3 = this.LLIIIZ;
            CommentContent commentContent4 = (CommentContent) this.LLIIIILZ;
            if (commentContent4 != null) {
                urlModel = commentContent4.getCoverUrl();
            } else {
                urlModel = null;
            }
            C4AS.LJII(c62846OlW3, urlModel, "Comment ViewHolder", null, null, 0, 0, 504);
            CommentContent commentContent5 = (CommentContent) this.LLIIIILZ;
            if (commentContent5 == null || (str3 = commentContent5.getAuthorName()) == null) {
                str3 = "";
            }
            CommentContent commentContent6 = (CommentContent) this.LLIIIILZ;
            if (commentContent6 == null || (str4 = commentContent6.getReplyUserName()) == null) {
                str4 = "";
            }
            CommentContent commentContent7 = (CommentContent) this.LLIIIILZ;
            if (commentContent7 != null) {
                urlModel2 = commentContent7.getAvatarUrl();
            } else {
                urlModel2 = null;
            }
            CommentContent commentContent8 = (CommentContent) this.LLIIIILZ;
            if (commentContent8 == null || (str5 = commentContent8.getComment()) == null) {
                str5 = "";
            }
            CommentContent commentContent9 = (CommentContent) this.LLIIIILZ;
            if (commentContent9 != null) {
                i2 = commentContent9.getCommentMediaType();
            } else {
                i2 = 0;
            }
            final Context context2 = this.itemView.getContext();
            Bitmap decodeResource = BitmapFactory.decodeResource(context2.getResources(), R.drawable.bia);
            final C68322mC c68322mC = new C68322mC();
            C119414mP c119414mP = CommentSharePackage.Companion;
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
            c119414mP.getClass();
            ?? LIZ2 = C119414mP.LIZ(context2, str3, str4, str5, decodeResource, LJJIIZ, i2);
            c68322mC.element = LIZ2;
            TuxTextView tuxTextView3 = this.LLIIJI;
            if (tuxTextView3 != 0) {
                tuxTextView3.setText((CharSequence) LIZ2);
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel2));
            LJII.LJIILL = R.drawable.bia;
            LJII.LIZJ = context2;
            LJII.LIZIZ("ChatRoomCommentShare");
            LJII.LJIIIZ(new AbstractC85293Wj() { // from class: X.4JV
                @Override // X.InterfaceC78660Uu0
                public final void onFailed(Throwable th) {
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [T, X.4i3] */
                @Override // X.InterfaceC78660Uu0
                public final void LIZIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    C68322mC<SpannableStringBuilder> c68322mC2 = c68322mC;
                    C119414mP c119414mP2 = CommentSharePackage.Companion;
                    Context context3 = context2;
                    o.LJIIIIZZ(context3, "context");
                    String str7 = str3;
                    String str8 = str4;
                    String str9 = str5;
                    int LIZIZ = C7MY.LIZIZ(18);
                    int i3 = i2;
                    c119414mP2.getClass();
                    c68322mC2.element = C119414mP.LIZ(context3, str7, str8, str9, bitmap, LIZIZ, i3);
                    TuxTextView tuxTextView4 = this.LLIIJI;
                    if (tuxTextView4 == null) {
                        return;
                    }
                    tuxTextView4.setText(c68322mC.element);
                }
            });
            TuxTextView tuxTextView4 = this.LLIIJI;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
        }
        IAwemeService LIZ3 = AwemeService.LIZ();
        if (commentContent2 != null && (awemeId = commentContent2.getAwemeId()) != null) {
            str6 = awemeId;
        }
        Aweme i6 = LIZ3.i6(str6);
        this.LLIIJLIL = i6;
        if (i6 == null) {
            XKX.LIZLLL(this.LLIIL, C78613UtF.LIZJ, null, new C3IJ(this, null), 2);
        }
    }
}
