package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224158qx extends AbstractC224038ql {
    public final InterfaceC223648q8 LJLLI;
    public C224168qy LJLLILLLL;
    public final C223788qM LJLLJ;
    public String LJLLL;
    public final ICLACaptionService LJLLLL;
    public final String LJLLLLLL;

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return false;
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return false;
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 18;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LJLILLLLZI);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.LJLILLLLZI, null, 6, 0);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJLILLLLZI));
        tuxTextView.setTuxFont(62);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) KL2.LIZJ(this.LJLILLLLZI, 1.0f);
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.LJLILLLLZI.getString(R.string.qft));
        C116424ha c116424ha = new C116424ha(this.LJLILLLLZI, null);
        c116424ha.setImageResource(R.drawable.bvr);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(c116424ha);
        return linearLayout;
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        TextStickerInfo textStickerInfo;
        if (this.LJLLILLLL == null) {
            C224168qy c224168qy = new C224168qy(this.LJLILLLLZI);
            this.LJLLILLLL = c224168qy;
            c224168qy.setInteractStickerParams(this.LJLJJI);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C224168qy c224168qy2 = this.LJLLILLLL;
            if (c224168qy2 != null) {
                c224168qy2.setLayoutParams(layoutParams);
            }
            C224168qy c224168qy3 = this.LJLLILLLL;
            if (c224168qy3 != null) {
                InteractStickerStruct interactStickerStruct = this.LJLJLLL;
                if (interactStickerStruct != null) {
                    textStickerInfo = interactStickerStruct.getTextInfo();
                } else {
                    textStickerInfo = null;
                }
                InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
                if (interactStickerStruct2 != null) {
                    interactStickerStruct2.getTextStruct();
                }
                c224168qy3.LJLJJL = textStickerInfo;
            }
        }
        C224168qy c224168qy4 = this.LJLLILLLL;
        if (c224168qy4 != null) {
            c224168qy4.setVisibility(8);
        }
        C224168qy c224168qy5 = this.LJLLILLLL;
        if (c224168qy5 != null) {
            c224168qy5.postInvalidate();
        }
        return this.LJLLILLLL;
    }

    public final void LJJ(boolean z, boolean z2) {
        FrameLayout bgContainer;
        float f;
        float f2;
        float f3;
        boolean z3;
        int i;
        Paint.Align align;
        Layout.Alignment alignment;
        OSZ osz;
        String bgColor;
        Drawable drawable;
        FrameLayout frameLayout;
        String textColor;
        TextView textView;
        GradientDrawable gradientDrawable;
        Drawable drawable2;
        GradientDrawable gradientDrawable2;
        FrameLayout frameLayout2;
        Drawable drawable3;
        GradientDrawable gradientDrawable3;
        FrameLayout frameLayout3;
        TextView textView2;
        NormalTrackTimeStamp normalTrackTimeStamp;
        float floatValue;
        float width;
        float f4;
        NormalTrackTimeStamp normalTrackTimeStamp2;
        float floatValue2;
        float height;
        float f5;
        NormalTrackTimeStamp normalTrackTimeStamp3;
        float f6;
        float width2;
        float height2;
        float f7;
        float f8;
        float f9;
        RectF rectF;
        NormalTrackTimeStamp normalTrackTimeStamp4;
        Float scale;
        String str;
        if (z && z2 && !TextUtils.isEmpty(this.LJLLL)) {
            C224168qy c224168qy = this.LJLLILLLL;
            if (c224168qy != null && c224168qy.getVisibility() == 0) {
                C224168qy c224168qy2 = this.LJLLILLLL;
                if (c224168qy2 != null) {
                    str = c224168qy2.getCurText();
                } else {
                    str = null;
                }
                if (o.LJ(str, this.LJLLL)) {
                    return;
                }
            }
            C224168qy c224168qy3 = this.LJLLILLLL;
            if (c224168qy3 != null && (bgContainer = c224168qy3.getBgContainer()) != null) {
                C223788qM c223788qM = this.LJLLJ;
                List<NormalTrackTimeStamp> LIZIZ = C223998qh.LIZIZ(this.LJLJLLL);
                if (LIZIZ == null || (normalTrackTimeStamp4 = (NormalTrackTimeStamp) ListProtector.get(LIZIZ, 0)) == null || (scale = normalTrackTimeStamp4.getScale()) == null) {
                    f = 1.0f;
                } else {
                    f = scale.floatValue();
                }
                c223788qM.getClass();
                List<NormalTrackTimeStamp> LIZIZ2 = C223998qh.LIZIZ(c223788qM.LJLJI);
                if (LIZIZ2 != null && (normalTrackTimeStamp3 = (NormalTrackTimeStamp) ListProtector.get(LIZIZ2, 0)) != null) {
                    C245649kW c245649kW = c223788qM.LJLJJI;
                    if (c245649kW != null) {
                        f6 = c245649kW.LIZIZ;
                    } else {
                        f6 = 0.0f;
                    }
                    TextStickerInfo textInfo = c223788qM.LJLJI.getTextInfo();
                    if (textInfo != null) {
                        width2 = textInfo.getSrcWidth();
                    } else {
                        width2 = normalTrackTimeStamp3.getWidth();
                    }
                    TextStickerInfo textInfo2 = c223788qM.LJLJI.getTextInfo();
                    if (textInfo2 != null) {
                        height2 = textInfo2.getSrcHeight();
                    } else {
                        height2 = normalTrackTimeStamp3.getHeight();
                    }
                    C245649kW c245649kW2 = c223788qM.LJLJJI;
                    if (c245649kW2 != null) {
                        f7 = c245649kW2.LIZ;
                    } else {
                        f7 = 0.0f;
                    }
                    float f10 = f7 * width2 * f;
                    if (c245649kW2 != null) {
                        f8 = c245649kW2.LIZIZ;
                    } else {
                        f8 = 0.0f;
                    }
                    float f11 = f8 * height2 * f;
                    if (f11 <= f6) {
                        f6 = f11;
                    }
                    if (c245649kW2 == null) {
                        rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        float f12 = 2;
                        float x = (normalTrackTimeStamp3.getX() * c245649kW2.LIZ) - (f10 / f12);
                        C245649kW c245649kW3 = c223788qM.LJLJJI;
                        if (c245649kW3 != null) {
                            f9 = c245649kW3.LIZIZ;
                        } else {
                            f9 = 0.0f;
                        }
                        float y = (normalTrackTimeStamp3.getY() * f9) - (f6 / f12);
                        rectF = new RectF(x, y, f10 + x, f6 + y);
                    }
                    bgContainer.setPivotX(f10 / 2.0f);
                    bgContainer.setPivotY(f6 / 2.0f);
                    bgContainer.setTranslationX(((rectF.width() - f10) / 2.0f) + rectF.left);
                    bgContainer.setTranslationY(((rectF.height() - f6) / 2.0f) + rectF.top);
                    bgContainer.setRotation(normalTrackTimeStamp3.getRotation());
                    ViewGroup.LayoutParams layoutParams = bgContainer.getLayoutParams();
                    layoutParams.width = (int) f10;
                    layoutParams.height = (int) f6;
                    bgContainer.setLayoutParams(layoutParams);
                    bgContainer.setVisibility(0);
                    bgContainer.invalidate();
                }
                C224168qy c224168qy4 = this.LJLLILLLL;
                if (c224168qy4 != null) {
                    String translatedText = this.LJLLL;
                    C223788qM c223788qM2 = this.LJLLJ;
                    List<NormalTrackTimeStamp> LIZIZ3 = C223998qh.LIZIZ(c223788qM2.LJLJI);
                    if (LIZIZ3 == null || (normalTrackTimeStamp2 = (NormalTrackTimeStamp) ListProtector.get(LIZIZ3, 0)) == null) {
                        f2 = 0.0f;
                    } else {
                        Float scale2 = normalTrackTimeStamp2.getScale();
                        if (scale2 == null) {
                            floatValue2 = 1.0f;
                        } else {
                            floatValue2 = scale2.floatValue();
                        }
                        C245649kW c245649kW4 = c223788qM2.LJLJJI;
                        if (c245649kW4 != null) {
                            f2 = c245649kW4.LIZIZ;
                        } else {
                            f2 = 0.0f;
                        }
                        TextStickerInfo textInfo3 = c223788qM2.LJLJI.getTextInfo();
                        if (textInfo3 != null) {
                            height = textInfo3.getSrcHeight();
                        } else {
                            height = normalTrackTimeStamp2.getHeight();
                        }
                        C245649kW c245649kW5 = c223788qM2.LJLJJI;
                        if (c245649kW5 != null) {
                            f5 = c245649kW5.LIZIZ;
                        } else {
                            f5 = 0.0f;
                        }
                        float f13 = f5 * height * floatValue2;
                        if (f13 <= f2) {
                            f2 = f13;
                        }
                    }
                    C223788qM c223788qM3 = this.LJLLJ;
                    List<NormalTrackTimeStamp> LIZIZ4 = C223998qh.LIZIZ(c223788qM3.LJLJI);
                    if (LIZIZ4 == null || (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(LIZIZ4, 0)) == null) {
                        f3 = 0.0f;
                    } else {
                        Float scale3 = normalTrackTimeStamp.getScale();
                        if (scale3 == null) {
                            floatValue = 1.0f;
                        } else {
                            floatValue = scale3.floatValue();
                        }
                        TextStickerInfo textInfo4 = c223788qM3.LJLJI.getTextInfo();
                        if (textInfo4 != null) {
                            width = textInfo4.getSrcWidth();
                        } else {
                            width = normalTrackTimeStamp.getWidth();
                        }
                        C245649kW c245649kW6 = c223788qM3.LJLJJI;
                        if (c245649kW6 != null) {
                            f4 = c245649kW6.LIZ;
                        } else {
                            f4 = 0.0f;
                        }
                        f3 = f4 * width * floatValue;
                    }
                    o.LJIIIZ(translatedText, "translatedText");
                    TextView textView3 = c224168qy4.LJLIL;
                    if (textView3 != null) {
                        textView3.setText(translatedText);
                    }
                    TextStickerInfo textStickerInfo = c224168qy4.LJLJJL;
                    if (textStickerInfo != null) {
                        int alignment2 = textStickerInfo.getAlignment();
                        if (alignment2 != 0) {
                            if (alignment2 != 1) {
                                if (alignment2 == 2 && (textView2 = c224168qy4.LJLIL) != null) {
                                    textView2.setTextAlignment(6);
                                }
                            } else {
                                TextView textView4 = c224168qy4.LJLIL;
                                if (textView4 != null) {
                                    textView4.setTextAlignment(5);
                                }
                            }
                        } else {
                            TextView textView5 = c224168qy4.LJLIL;
                            if (textView5 != null) {
                                textView5.setTextAlignment(4);
                            }
                        }
                    }
                    c224168qy4.LJLJL = false;
                    float LJJIIZ = f2 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    float LJJIIZ2 = f3 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    if (LJJIIZ <= O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)) || LJJIIZ2 <= O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))) {
                        z3 = false;
                    } else {
                        f3 = LJJIIZ2;
                        f2 = LJJIIZ;
                        z3 = true;
                    }
                    TextStickerInfo textStickerInfo2 = c224168qy4.LJLJJL;
                    if (textStickerInfo2 != null) {
                        i = textStickerInfo2.getAlignment();
                    } else {
                        i = 0;
                    }
                    int i2 = (int) f3;
                    int i3 = (int) f2;
                    c224168qy4.LJLJI.setAntiAlias(true);
                    c224168qy4.LJLJI.setTypeface(Typeface.DEFAULT_BOLD);
                    TextPaint textPaint = c224168qy4.LJLJI;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                align = Paint.Align.CENTER;
                            } else {
                                align = Paint.Align.RIGHT;
                            }
                        } else {
                            align = Paint.Align.LEFT;
                        }
                    } else {
                        align = Paint.Align.CENTER;
                    }
                    textPaint.setTextAlign(align);
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            }
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                    int LJIJ = C78939UyV.LJIJ(24, 2, -2);
                    if (LJIJ <= 24) {
                        int i4 = 24;
                        while (true) {
                            c224168qy4.LJLJI.setTextSize(C32151Nz.LJJIII(Integer.valueOf(i4)));
                            DynamicLayout dynamicLayout = new DynamicLayout(translatedText, c224168qy4.LJLJI, i2, alignment, 1.0f, 0.0f, true);
                            if (dynamicLayout.getHeight() < i3) {
                                StringBuilder LJ = C7MY.LJ("size: ", i4, "; textH: ");
                                LJ.append(dynamicLayout.getHeight());
                                LJ.append("; maxH: ");
                                LJ.append(i3);
                                C36922EeM.LIZLLL(4, "TextSticker", X1D.LIZIZ(LJ));
                                osz = new OSZ(Float.valueOf(i4), Boolean.valueOf(z3));
                                break;
                            }
                            if (i4 == LJIJ) {
                                break;
                            } else {
                                i4 -= 2;
                            }
                        }
                    }
                    osz = new OSZ(Float.valueOf(2.0f), Boolean.FALSE);
                    float floatValue3 = ((Number) osz.getFirst()).floatValue();
                    boolean booleanValue = ((Boolean) osz.getSecond()).booleanValue();
                    FrameLayout frameLayout4 = c224168qy4.LJLJJI;
                    if (frameLayout4 != null) {
                        float x2 = frameLayout4.getX();
                        if (x2 < 0.0f && Math.abs(x2) < 20.0f && (frameLayout3 = c224168qy4.LJLJJI) != null) {
                            frameLayout3.setTranslationX(Math.abs(x2));
                        }
                    }
                    TextStickerInfo textStickerInfo3 = c224168qy4.LJLJJL;
                    if (textStickerInfo3 != null && (bgColor = textStickerInfo3.getBgColor()) != null) {
                        try {
                            if (ujb.o.LJJJLIIL(bgColor, "#ff", false) || ujb.o.LJJJLIIL(bgColor, "#FF", false)) {
                                FrameLayout frameLayout5 = c224168qy4.LJLJJI;
                                if (frameLayout5 != null) {
                                    frameLayout5.setBackground(C04270Et.LIZIZ(c224168qy4.getContext(), R.drawable.a7d));
                                }
                                FrameLayout frameLayout6 = c224168qy4.LJLJJI;
                                if (frameLayout6 != null) {
                                    drawable = frameLayout6.getBackground();
                                } else {
                                    drawable = null;
                                }
                                if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                                    gradientDrawable.setColor(Color.parseColor(bgColor));
                                }
                                TextStickerInfo textStickerInfo4 = c224168qy4.LJLJJL;
                                if (textStickerInfo4 != null && (textColor = textStickerInfo4.getTextColor()) != null && (textView = c224168qy4.LJLIL) != null) {
                                    textView.setTextColor(Color.parseColor(textColor));
                                }
                                if (booleanValue && (frameLayout = c224168qy4.LJLJJI) != null) {
                                    frameLayout.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                                }
                            } else if (booleanValue && floatValue3 == 24.0f) {
                                c224168qy4.LJLJL = true;
                                TextView textView6 = c224168qy4.LJLIL;
                                if (textView6 != null) {
                                    textView6.setBackgroundDrawable(C04270Et.LIZIZ(c224168qy4.getContext(), R.drawable.a7d));
                                }
                                TextView textView7 = c224168qy4.LJLIL;
                                if (textView7 != null) {
                                    drawable3 = textView7.getBackground();
                                } else {
                                    drawable3 = null;
                                }
                                if (drawable3 instanceof GradientDrawable) {
                                    gradientDrawable3 = (GradientDrawable) drawable3;
                                } else {
                                    gradientDrawable3 = null;
                                }
                                Resources resources = c224168qy4.getResources();
                                if (resources != null && gradientDrawable3 != null) {
                                    gradientDrawable3.setColor(resources.getColor(R.color.au));
                                }
                                TextView textView8 = c224168qy4.LJLIL;
                                if (textView8 != null) {
                                    textView8.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                                }
                            } else {
                                FrameLayout frameLayout7 = c224168qy4.LJLJJI;
                                if (frameLayout7 != null) {
                                    frameLayout7.setBackground(C04270Et.LIZIZ(c224168qy4.getContext(), R.drawable.a7d));
                                }
                                FrameLayout frameLayout8 = c224168qy4.LJLJJI;
                                if (frameLayout8 != null) {
                                    drawable2 = frameLayout8.getBackground();
                                } else {
                                    drawable2 = null;
                                }
                                if (drawable2 instanceof GradientDrawable) {
                                    gradientDrawable2 = (GradientDrawable) drawable2;
                                } else {
                                    gradientDrawable2 = null;
                                }
                                Resources resources2 = c224168qy4.getResources();
                                if (resources2 != null && gradientDrawable2 != null) {
                                    gradientDrawable2.setColor(resources2.getColor(R.color.au));
                                }
                                if (booleanValue && (frameLayout2 = c224168qy4.LJLJJI) != null) {
                                    frameLayout2.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    TextView textView9 = c224168qy4.LJLIL;
                    if (textView9 != null) {
                        textView9.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    TextView textView10 = c224168qy4.LJLIL;
                    if (textView10 != null) {
                        textView10.setTextSize(floatValue3);
                    }
                    TextView textView11 = c224168qy4.LJLIL;
                    if (textView11 != null) {
                        textView11.setLineSpacing(0.0f, 1.0f);
                    }
                    TextView textView12 = c224168qy4.LJLIL;
                    if (textView12 != null) {
                        textView12.setVisibility(0);
                    }
                    TextView textView13 = c224168qy4.LJLIL;
                    if (textView13 != null) {
                        textView13.invalidate();
                    }
                }
            }
            C224168qy c224168qy5 = this.LJLLILLLL;
            if (c224168qy5 == null) {
                return;
            }
            c224168qy5.setVisibility(0);
            return;
        }
        C224168qy c224168qy6 = this.LJLLILLLL;
        if (c224168qy6 != null) {
            c224168qy6.setVisibility(8);
        }
    }

    public final void LJJI(Long l, boolean z) {
        if (l != null) {
            l.longValue();
            if (this.LJLJLLL == null) {
                return;
            }
            List<? extends NormalTrackTimeStamp> list = this.LJLL;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                    NormalTrackTimeStamp normalTrackTimeStamp2 = normalTrackTimeStamp;
                    if (normalTrackTimeStamp2 != null && (normalTrackTimeStamp2.isWholeDuration() || (normalTrackTimeStamp2.timeIsValid() && ((float) l.longValue()) >= normalTrackTimeStamp2.getStartTime() - 150.0f && normalTrackTimeStamp2.getEndTime() - 150.0f >= ((float) l.longValue())))) {
                        arrayList.add(normalTrackTimeStamp);
                    }
                }
                if (!arrayList.isEmpty()) {
                    LJJ(z, true);
                    return;
                }
            }
            LJJ(z, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.8qM] */
    public C224158qx(int i, final Context context, C224048qm c224048qm, final InteractStickerStruct stickerStruct, final C245649kW c245649kW, final InterfaceC223648q8 interfaceC223648q8) {
        super(i, context, c224048qm, stickerStruct, c245649kW);
        o.LJIIIZ(stickerStruct, "stickerStruct");
        this.LJLLI = interfaceC223648q8;
        this.LJLLJ = new AbstractC221838nD(context, this, stickerStruct, c245649kW, interfaceC223648q8) { // from class: X.8qM
            public final InterfaceC223648q8 LJLJJL;

            @Override // X.AbstractC221838nD
            public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
                o.LJIIIZ(popListener, "popListener");
            }

            @Override // X.AbstractC221838nD
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct2) {
                o.LJIIIZ(stickerStruct2, "stickerStruct");
                return C223998qh.LIZJ(j, stickerStruct2);
            }

            {
                o.LJIIIZ(this, "containerView");
                o.LJIIIZ(stickerStruct, "stickerStruct");
                this.LJLJJL = interfaceC223648q8;
            }
        };
        this.LJLLL = "";
        this.LJLLLL = CaptionServiceImpl.LJIILIIL();
        this.LJLLLLLL = "Sticker.TextTranslateStickerView";
    }
}
