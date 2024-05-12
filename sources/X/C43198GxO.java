package X;

import Y.ACListenerS27S0100000_7;
import Y.IDCSpanS32S0100000_7;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.i0;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GxO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43198GxO extends RelativeLayout {
    public static final ArrayList<InterfaceC43207GxX> LJLL = new ArrayList<>();
    public static final HandlerC43202GxS LJLLI = new HandlerC43202GxS(C16880lQ.LLJJJJ());
    public static int LJLLILLLL;
    public RelativeLayout LJLIL;
    public ImageView LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public InterfaceC43207GxX LJLJLJ;
    public final C43199GxP LJLJLLL;

    public final void LIZ() {
        TextView textView = this.LJLJJI;
        if (textView != null) {
            textView.setVisibility(8);
            TextView textView2 = this.LJLJJL;
            if (textView2 != null) {
                textView2.setVisibility(8);
                ImageView imageView = this.LJLILLLLZI;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    TextView textView3 = this.LJLJI;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                        getMDownloadProgressViewRoot().setBackgroundColor(ColorProtector.parseColor("#383838"));
                        getMDownloadProgressViewRoot().setVisibility(0);
                        getMDownloadFailedTextView().setWidth(KL2.LJIIJJI(getContext()) - ((int) KL2.LIZJ(getContext(), 77.0f)));
                        getMDownloadFailedTextView().setVisibility(0);
                        TextView textView4 = this.LJLJL;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            getMDownloadFailedTextView().requestLayout();
                            getMDownloadProgressViewRoot().requestLayout();
                            LIZJ();
                            HandlerC43202GxS handlerC43202GxS = LJLLI;
                            if (!handlerC43202GxS.hasMessages(2)) {
                                handlerC43202GxS.sendEmptyMessageDelayed(2, 3000L);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("mDownloadVideoCancelView");
                        throw null;
                    }
                    o.LJIJI("mDownloadSuccessTextView");
                    throw null;
                }
                o.LJIJI("mDownloadSuccessImageView");
                throw null;
            }
            o.LJIJI("mDownloadingStatusTextView");
            throw null;
        }
        o.LJIJI("mDownloadProgressView");
        throw null;
    }

    public final void LIZIZ() {
        TextView textView = this.LJLJJI;
        if (textView != null) {
            textView.setVisibility(8);
            TextView textView2 = this.LJLJJL;
            if (textView2 != null) {
                textView2.setVisibility(8);
                TextView textView3 = this.LJLJL;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    getMDownloadFailedTextView().setVisibility(8);
                    getMDownloadProgressViewRoot().setBackgroundColor(getResources().getColor(R.color.cc));
                    getMDownloadProgressViewRoot().setVisibility(0);
                    ImageView imageView = this.LJLILLLLZI;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        TextView textView4 = this.LJLJI;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            getMDownloadProgressViewRoot().requestLayout();
                            LIZJ();
                            HandlerC43202GxS handlerC43202GxS = LJLLI;
                            if (!handlerC43202GxS.hasMessages(1)) {
                                handlerC43202GxS.sendEmptyMessageDelayed(1, 1000L);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("mDownloadSuccessTextView");
                        throw null;
                    }
                    o.LJIJI("mDownloadSuccessImageView");
                    throw null;
                }
                o.LJIJI("mDownloadVideoCancelView");
                throw null;
            }
            o.LJIJI("mDownloadingStatusTextView");
            throw null;
        }
        o.LJIJI("mDownloadProgressView");
        throw null;
    }

    public final TextView getMDownloadFailedTextView() {
        TextView textView = this.LJLJJLL;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("mDownloadFailedTextView");
        throw null;
    }

    public final RelativeLayout getMDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.LJLIL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("mDownloadProgressViewRoot");
        throw null;
    }

    public final void LIZJ() {
        if (TextUtils.equals("ar", C60903NvH.LJIIJJI().getAppLanguage())) {
            TextView textView = this.LJLJJI;
            if (textView != null) {
                textView.setText("%0");
                return;
            } else {
                o.LJIJI("mDownloadProgressView");
                throw null;
            }
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            textView2.setText("0%");
        } else {
            o.LJIJI("mDownloadProgressView");
            throw null;
        }
    }

    public final InterfaceC43207GxX getVideoDownloadClickListener() {
        return this.LJLJLJ;
    }

    public final void LIZLLL(int i) {
        ImageView imageView = this.LJLILLLLZI;
        if (imageView != null) {
            imageView.setVisibility(8);
            TextView textView = this.LJLJI;
            if (textView != null) {
                textView.setVisibility(8);
                getMDownloadFailedTextView().setVisibility(8);
                getMDownloadProgressViewRoot().setBackgroundColor(ColorProtector.parseColor("#383838"));
                getMDownloadProgressViewRoot().setVisibility(0);
                TextView textView2 = this.LJLJJI;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    TextView textView3 = this.LJLJJL;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        TextView textView4 = this.LJLJL;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            if (TextUtils.equals("ar", C60903NvH.LJIIJJI().getAppLanguage())) {
                                TextView textView5 = this.LJLJJI;
                                if (textView5 != null) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append('%');
                                    LIZ.append(i);
                                    textView5.setText(X1D.LIZIZ(LIZ));
                                } else {
                                    o.LJIJI("mDownloadProgressView");
                                    throw null;
                                }
                            } else {
                                TextView textView6 = this.LJLJJI;
                                if (textView6 != null) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(i);
                                    LIZ2.append('%');
                                    textView6.setText(X1D.LIZIZ(LIZ2));
                                } else {
                                    o.LJIJI("mDownloadProgressView");
                                    throw null;
                                }
                            }
                            LJLLILLLL = i;
                            return;
                        }
                        o.LJIJI("mDownloadVideoCancelView");
                        throw null;
                    }
                    o.LJIJI("mDownloadingStatusTextView");
                    throw null;
                }
                o.LJIJI("mDownloadProgressView");
                throw null;
            }
            o.LJIJI("mDownloadSuccessTextView");
            throw null;
        }
        o.LJIJI("mDownloadSuccessImageView");
        throw null;
    }

    public final void setMDownloadFailedTextView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLJJLL = textView;
    }

    public final void setMDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        o.LJIIIZ(relativeLayout, "<set-?>");
        this.LJLIL = relativeLayout;
    }

    public final void setVideoDownloadClickListener(InterfaceC43207GxX interfaceC43207GxX) {
        this.LJLJLJ = interfaceC43207GxX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43198GxO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJLLL = new C43199GxP();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cr5, this, true);
        View findViewById = findViewById(R.id.j7c);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.root_download_progress_bar)");
        setMDownloadProgressViewRoot((RelativeLayout) findViewById);
        C16880lQ.LJIJ(getMDownloadProgressViewRoot(), ViewOnClickListenerC43210Gxa.LJLIL);
        View findViewById2 = findViewById(R.id.cg8);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.download_success_img)");
        this.LJLILLLLZI = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.cg9);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.download_success_txt)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.cfz);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.download_progress)");
        this.LJLJJI = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.cgc);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.downloading_status_txt)");
        this.LJLJJL = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.cfr);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.download_failed_status_txt)");
        setMDownloadFailedTextView((TextView) findViewById6);
        String string = getContext().getString(R.string.gdy);
        o.LJIIIIZZ(string, "context.getString(R.stri….feed_download_savefail3)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getContext().getString(R.string.gdw));
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        SpannableString spannableString = new SpannableString(i0.LJFF(string, LIZIZ));
        spannableString.setSpan(new IDCSpanS32S0100000_7(this, 3), s.LJJLIIIJL(spannableString, LIZIZ, 0, false, 6), (LIZIZ.length() + s.LJJLIIIJL(spannableString, LIZIZ, 0, false, 6)) - 1, 17);
        getMDownloadFailedTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getMDownloadFailedTextView().setText(spannableString);
        View findViewById7 = findViewById(R.id.cfq);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.download_cancel)");
        TextView textView = (TextView) findViewById7;
        this.LJLJL = textView;
        C16880lQ.LJIJI(textView, new ACListenerS27S0100000_7(this, 81));
        LIZJ();
    }
}
