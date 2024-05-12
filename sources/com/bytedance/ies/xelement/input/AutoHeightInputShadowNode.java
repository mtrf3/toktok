package com.bytedance.ies.xelement.input;

import X.C38392F4y;
import X.C41997Ge1;
import X.C74076T5k;
import X.C79697VPp;
import X.EnumC79692VPk;
import X.F5B;
import X.VPD;
import X.VPR;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AutoHeightInputShadowNode extends TextShadowNode {
    public int LJJJJIZL;
    public int LJJJJJ;
    public float LJJJJJL = Float.MAX_VALUE;
    public float LJJJJL = Float.MAX_VALUE;
    public float LJJJJLI = Float.MAX_VALUE;
    public C41997Ge1 LJJJJLL;

    public final void LJJJIL() {
        C41997Ge1 c41997Ge1 = this.LJJJJLL;
        if (c41997Ge1 != null && c41997Ge1.getMaxHeight() >= 0) {
            C41997Ge1 c41997Ge12 = this.LJJJJLL;
            if (c41997Ge12 != null) {
                if (c41997Ge12.getMinHeight() < 0) {
                    return;
                }
                C41997Ge1 c41997Ge13 = this.LJJJJLL;
                if (c41997Ge13 != null) {
                    if (c41997Ge13.getHint() == null) {
                        return;
                    }
                    C41997Ge1 c41997Ge14 = this.LJJJJLL;
                    if (c41997Ge14 != null) {
                        CharSequence hint = c41997Ge14.getHint();
                        o.LJFF(hint, "mEditText!!.hint");
                        this.LJJJJIZL = LJJJI(hint).getHeight();
                        C41997Ge1 c41997Ge15 = this.LJJJJLL;
                        if (c41997Ge15 != null) {
                            int minHeight = c41997Ge15.getMinHeight();
                            C41997Ge1 c41997Ge16 = this.LJJJJLL;
                            if (c41997Ge16 != null) {
                                int maxHeight = c41997Ge16.getMaxHeight();
                                int max = Math.max(this.LJJJJIZL, minHeight);
                                this.LJJJJIZL = max;
                                this.LJJJJIZL = Math.min(max, maxHeight);
                                return;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    public final boolean LJJJJ() {
        C41997Ge1 c41997Ge1 = this.LJJJJLL;
        if (c41997Ge1 != null && c41997Ge1.getMaxHeight() >= 0) {
            C41997Ge1 c41997Ge12 = this.LJJJJLL;
            if (c41997Ge12 != null) {
                if (c41997Ge12.getMinHeight() >= 0) {
                    int min = Math.min(Math.max(this.LJJJJJ, this.LJJJJIZL), (int) this.LJJJJJL);
                    C41997Ge1 c41997Ge13 = this.LJJJJLL;
                    if (c41997Ge13 != null) {
                        if (c41997Ge13.getHeight() == min) {
                            return false;
                        }
                        LJIIIIZZ();
                        return true;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        return false;
    }

    public final void LJJJJI() {
        C41997Ge1 c41997Ge1 = this.LJJJJLL;
        if (c41997Ge1 != null && c41997Ge1.getMaxHeight() >= 0) {
            C41997Ge1 c41997Ge12 = this.LJJJJLL;
            if (c41997Ge12 != null) {
                if (c41997Ge12.getMinHeight() < 0) {
                    return;
                }
                C41997Ge1 c41997Ge13 = this.LJJJJLL;
                if (c41997Ge13 != null) {
                    if (c41997Ge13.getEditableText() == null) {
                        return;
                    }
                    C41997Ge1 c41997Ge14 = this.LJJJJLL;
                    if (c41997Ge14 != null) {
                        Editable editableText = c41997Ge14.getEditableText();
                        o.LJFF(editableText, "mEditText!!.editableText");
                        this.LJJJJJ = LJJJI(editableText).getHeight();
                        C41997Ge1 c41997Ge15 = this.LJJJJLL;
                        if (c41997Ge15 != null) {
                            int minHeight = c41997Ge15.getMinHeight();
                            C41997Ge1 c41997Ge16 = this.LJJJJLL;
                            if (c41997Ge16 != null) {
                                int maxHeight = c41997Ge16.getMaxHeight();
                                int max = Math.max(this.LJJJJJ, minHeight);
                                this.LJJJJJ = max;
                                this.LJJJJJ = Math.min(max, maxHeight);
                                return;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    public final Layout LJJJI(CharSequence charSequence) {
        Layout.Alignment alignment;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        C41997Ge1 c41997Ge1 = this.LJJJJLL;
        if (c41997Ge1 != null) {
            int gravity = c41997Ge1.getGravity();
            if (gravity != 3) {
                if (gravity != 5) {
                    if (gravity != 17) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C41997Ge1 c41997Ge12 = this.LJJJJLL;
                if (c41997Ge12 != null) {
                    int textDirection = c41997Ge12.getTextDirection();
                    if (textDirection != 3) {
                        if (textDirection != 4) {
                            if (textDirection != 5) {
                                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
                            } else {
                                textDirectionHeuristic2 = TextDirectionHeuristics.LOCALE;
                            }
                        } else {
                            textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
                        }
                    } else {
                        textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
                    }
                    int length = charSequence.length();
                    C41997Ge1 c41997Ge13 = this.LJJJJLL;
                    if (c41997Ge13 != null) {
                        StaticLayout.Builder textDirection2 = StaticLayout.Builder.obtain(charSequence, 0, length, c41997Ge13.getPaint(), (int) this.LJJJJLI).setAlignment(alignment).setTextDirection(textDirectionHeuristic2);
                        C41997Ge1 c41997Ge14 = this.LJJJJLL;
                        if (c41997Ge14 != null) {
                            float lineSpacingExtra = c41997Ge14.getLineSpacingExtra();
                            C41997Ge1 c41997Ge15 = this.LJJJJLL;
                            if (c41997Ge15 != null) {
                                StaticLayout.Builder lineSpacing = textDirection2.setLineSpacing(lineSpacingExtra, c41997Ge15.getLineSpacingMultiplier());
                                C41997Ge1 c41997Ge16 = this.LJJJJLL;
                                if (c41997Ge16 != null) {
                                    StaticLayout build = lineSpacing.setIncludePad(c41997Ge16.getIncludeFontPadding()).build();
                                    o.LJFF(build, "StaticLayout.Builder\n   …\n                .build()");
                                    return build;
                                }
                                o.LJIIZILJ();
                                throw null;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            C41997Ge1 c41997Ge17 = this.LJJJJLL;
            if (c41997Ge17 != null) {
                int textDirection3 = c41997Ge17.getTextDirection();
                if (textDirection3 != 3) {
                    if (textDirection3 != 4) {
                        if (textDirection3 != 5) {
                            textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            o.LJFF(textDirectionHeuristic, "TextDirectionHeuristics.LTR");
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            o.LJFF(textDirectionHeuristic, "TextDirectionHeuristics.LOCALE");
                        }
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        o.LJFF(textDirectionHeuristic, "TextDirectionHeuristics.RTL");
                    }
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    o.LJFF(textDirectionHeuristic, "TextDirectionHeuristics.LTR");
                }
                int length2 = charSequence.length();
                C41997Ge1 c41997Ge18 = this.LJJJJLL;
                if (c41997Ge18 != null) {
                    TextPaint paint = c41997Ge18.getPaint();
                    int i = (int) this.LJJJJLI;
                    C41997Ge1 c41997Ge19 = this.LJJJJLL;
                    if (c41997Ge19 != null) {
                        float lineSpacingMultiplier = c41997Ge19.getLineSpacingMultiplier();
                        C41997Ge1 c41997Ge110 = this.LJJJJLL;
                        if (c41997Ge110 != null) {
                            float lineSpacingExtra2 = c41997Ge110.getLineSpacingExtra();
                            C41997Ge1 c41997Ge111 = this.LJJJJLL;
                            if (c41997Ge111 != null) {
                                StaticLayout LIZ = C74076T5k.LIZ(charSequence, length2, paint, i, alignment, lineSpacingMultiplier, lineSpacingExtra2, c41997Ge111.getIncludeFontPadding(), TextUtils.TruncateAt.END, -1, textDirectionHeuristic);
                                o.LJFF(LIZ, "StaticLayoutCompat.get(\n…nHeuristics\n            )");
                                return LIZ;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @VPD(name = "font-size")
    public final void setFontTextSize(F5B f5b) {
        if (f5b == null) {
            setFontSize(VPR.LIZJ("14px", 0.0f, 0.0f));
            return;
        }
        ReadableType type = f5b.getType();
        if (type == null) {
            return;
        }
        int i = C38392F4y.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            setFontSize(VPR.LIZJ(f5b.asString(), 0.0f, 0.0f));
            return;
        }
        setFontSize((float) f5b.asDouble());
    }

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    public final long LIZJ(LayoutNode node, float f, EnumC79692VPk widthMode, float f2, EnumC79692VPk heightMode) {
        o.LJIIJ(node, "node");
        o.LJIIJ(widthMode, "widthMode");
        o.LJIIJ(heightMode, "heightMode");
        this.LJJJJL = f2;
        this.LJJJJLI = f;
        EnumC79692VPk enumC79692VPk = EnumC79692VPk.EXACTLY;
        if (heightMode == enumC79692VPk && widthMode == enumC79692VPk) {
            this.LJJJJJL = Float.MAX_VALUE;
            return C79697VPp.LIZ(f, f2);
        }
        LJJJJI();
        LJJJIL();
        float max = Math.max(this.LJJJJJ, this.LJJJJIZL);
        this.LJJJJL = max;
        if (heightMode == EnumC79692VPk.UNDEFINED) {
            this.LJJJJJL = Float.MAX_VALUE;
        } else if (heightMode == EnumC79692VPk.AT_MOST) {
            this.LJJJJJL = f2;
            this.LJJJJL = Math.min(max, f2);
        }
        return C79697VPp.LIZ(f, this.LJJJJL);
    }
}
