package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199897sv extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C199897sv(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C199897sv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public static boolean LIZJ(MutualStruct struct) {
        o.LJIIIZ(struct, "struct");
        if (struct.getUserList() != null && (!r0.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void LIZ(MutualStruct mutual) {
        List<MutualUser> userList;
        int i;
        o.LJIIIZ(mutual, "mutual");
        setVisibility(8);
        if (LIZJ(mutual) && (userList = mutual.getUserList()) != null) {
            setVisibility(0);
            removeAllViews();
            int size = userList.size();
            int i2 = 0;
            while (true) {
                i = 99;
                if (i2 >= size) {
                    break;
                }
                if (ListProtector.get(userList, i2) == null) {
                    return;
                }
                boolean z = true;
                if (i2 >= userList.size() - 1 && mutual.getTotal() <= userList.size()) {
                    z = false;
                }
                View LIZLLL = LIZLLL((MutualUser) ListProtector.get(userList, i2), i2, z);
                if (i2 == 2) {
                    if (userList.size() == 3 && userList.size() == mutual.getTotal()) {
                        addView(LIZLLL((MutualUser) ListProtector.get(userList, i2), i2, false));
                    }
                } else {
                    if (i2 >= 2) {
                        break;
                    }
                    addView(LIZLLL);
                    i2++;
                }
            }
            int total = mutual.getTotal() - 2;
            if (total > 99) {
                total = 99;
            }
            addView(LJ(i2, total));
            if (userList.size() != 0 && userList.size() <= 2 && userList.size() < mutual.getTotal()) {
                int total2 = mutual.getTotal() - userList.size();
                int size2 = userList.size();
                if (total2 <= 99) {
                    i = total2;
                }
                addView(LJ(size2, i));
            }
        }
    }

    public final void LIZIZ(MutualStruct mutual) {
        List<MutualUser> userList;
        o.LJIIIZ(mutual, "mutual");
        setVisibility(8);
        if (LIZJ(mutual) && (userList = mutual.getUserList()) != null) {
            setVisibility(0);
            removeAllViews();
            int size = userList.size();
            for (int i = 0; i < size && ListProtector.get(userList, i) != null && i <= 2; i++) {
                addView(LIZLLL((MutualUser) ListProtector.get(userList, i), i, false));
            }
        }
    }

    public final void setAvatarSizeModel(int i) {
        this.LJLJLJ = i;
    }

    public final void setDarkMode(boolean z) {
        this.LJLJI = z;
    }

    public final void setSocialVideoTag(boolean z) {
        this.LJLJJI = z;
    }

    public final View LJ(int i, int i2) {
        View view;
        OSZ osz;
        View view2;
        if (this.LJLJJL) {
            int i3 = this.LJLJJLL;
            int i4 = this.LJLJL;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            int i5 = this.LJLILLLLZI;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            if (C90193gN.LIZIZ(tuxTextView.getContext())) {
                layoutParams.setMargins(0, 0, (this.LJLIL * i) + LJJIIZ, 0);
            } else {
                layoutParams.setMargins((this.LJLIL * i) + LJJIIZ, 0, 0, 0);
            }
            tuxTextView.setLayoutParams(layoutParams);
            tuxTextView.setGravity(17);
            tuxTextView.setLines(1);
            tuxTextView.setTextColor(i4);
            tuxTextView.setTuxFont(82);
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), C1FJ.LIZIZ(0), C1FJ.LIZIZ(0), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), 16);
            tuxTextView.setGravity(17);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            if (paint != null) {
                paint.setStyle(Paint.Style.FILL);
            }
            Paint paint2 = shapeDrawable.getPaint();
            if (paint2 != null) {
                paint2.setColor(i3);
            }
            Paint paint3 = shapeDrawable.getPaint();
            if (paint3 != null) {
                paint3.setAntiAlias(true);
            }
            tuxTextView.setBackground(shapeDrawable);
            tuxTextView.setText(tuxTextView.getContext().getString(R.string.ptl, Integer.valueOf(i2)));
            view2 = tuxTextView;
        } else {
            if (this.LJLJI) {
                view = C16880lQ.LLLZIIL(R.layout.bkk, C16880lQ.LLZIL(getContext()), null);
            } else {
                view = C16880lQ.LLLZIIL(R.layout.bkj, C16880lQ.LLZIL(getContext()), null);
            }
            int i6 = this.LJLJLJ;
            if (i6 != 14) {
                if (i6 != 16) {
                    if (i6 != 22) {
                        if (i6 != 32) {
                            if (i6 != 36) {
                                if (i6 != 40) {
                                    osz = new OSZ(Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLIL));
                                } else {
                                    osz = new OSZ(AnonymousClass391.LIZJ(40), AnonymousClass391.LIZJ(32));
                                }
                            } else {
                                osz = new OSZ(AnonymousClass391.LIZJ(36), AnonymousClass391.LIZJ(22));
                            }
                        } else {
                            osz = new OSZ(AnonymousClass391.LIZJ(32), AnonymousClass391.LIZJ(20));
                        }
                    } else {
                        osz = new OSZ(AnonymousClass391.LIZJ(22), AnonymousClass391.LIZJ(12));
                    }
                } else {
                    osz = new OSZ(AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(12));
                }
            } else {
                osz = new OSZ(AnonymousClass391.LIZJ(14), AnonymousClass391.LIZJ(12));
            }
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(intValue, intValue);
            if (C90193gN.LIZIZ(view.getContext())) {
                layoutParams2.setMargins(0, 0, intValue2 * i, 0);
            } else {
                layoutParams2.setMargins(intValue2 * i, 0, 0, 0);
            }
            view.setLayoutParams(layoutParams2);
            if (!this.LJLJI) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ck);
                c110614Vt.LIZJ = C61328O5c.LIZJ(360);
                c110614Vt.LIZLLL = C1FJ.LIZIZ(1);
                c110614Vt.LJFF = Integer.valueOf(R.attr.cl);
                c110614Vt.LJII = intValue;
                c110614Vt.LJI = intValue;
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "context");
                view.setBackground(c110614Vt.LIZ(context2));
                C26338AVi.LJIIIZ(view, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), C1FJ.LIZIZ(1), C1FJ.LIZIZ(1), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), 16);
            }
            ((TextView) view.findViewById(R.id.mck)).setText(getContext().getString(R.string.ptl, Integer.valueOf(i2)));
            view2 = view;
        }
        return view2;
    }

    public final void LJFF(int i, int i2) {
        if ((i != this.LJLILLLLZI || i2 != this.LJLIL) && getChildCount() > 0) {
            removeAllViews();
        }
        this.LJLILLLLZI = i;
        this.LJLIL = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C199897sv(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            r0 = 13
            int r0 = X.C7MY.LIZIZ(r0)
            r2.LJLIL = r0
            r0 = 20
            int r0 = X.C7MY.LIZIZ(r0)
            r2.LJLILLLLZI = r0
            boolean r0 = r2.LJLJI
            r1 = 2131099740(0x7f06005c, float:1.7811842E38)
            if (r0 == 0) goto L3d
            r0 = 2131099740(0x7f06005c, float:1.7811842E38)
        L28:
            int r0 = X.C04330Ez.LIZIZ(r3, r0)
            r2.LJLJJLL = r0
            boolean r0 = r2.LJLJI
            if (r0 == 0) goto L39
        L32:
            int r0 = X.C04330Ez.LIZIZ(r3, r1)
            r2.LJLJL = r0
            return
        L39:
            r1 = 2131099726(0x7f06004e, float:1.7811813E38)
            goto L32
        L3d:
            r0 = 2131099658(0x7f06000a, float:1.7811675E38)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199897sv.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final View LIZLLL(MutualUser mutualUser, int i, boolean z) {
        View createAvatarViewWithBackground$lambda$0;
        OSZ osz;
        View view;
        Float f;
        UrlModel urlModel = null;
        if (this.LJLJJL) {
            int i2 = this.LJLIL;
            int i3 = i * i2;
            if (z) {
                f = Float.valueOf(i2);
            } else {
                f = null;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            SJR sjr = new SJR(context, f);
            int i4 = this.LJLILLLLZI;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4);
            if (C90193gN.LIZIZ(sjr.getContext())) {
                layoutParams.setMargins(0, 0, i3, 0);
            } else {
                layoutParams.setMargins(i3, 0, 0, 0);
            }
            sjr.setLayoutParams(layoutParams);
            if (mutualUser != null) {
                urlModel = mutualUser.getAvatarMedium();
            }
            C78765Uvh.LJFF(sjr, urlModel);
            view = sjr;
        } else {
            if (this.LJLJI) {
                createAvatarViewWithBackground$lambda$0 = C16880lQ.LLLZIIL(R.layout.bki, C16880lQ.LLZIL(getContext()), null);
            } else {
                createAvatarViewWithBackground$lambda$0 = C16880lQ.LLLZIIL(R.layout.bkh, C16880lQ.LLZIL(getContext()), null);
            }
            o.LJIIIIZZ(createAvatarViewWithBackground$lambda$0, "createAvatarViewWithBackground$lambda$0");
            C26338AVi.LJIIIZ(createAvatarViewWithBackground$lambda$0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), AnonymousClass391.LIZJ(1), AnonymousClass391.LIZJ(1), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), 16);
            if (this.LJLJJI) {
                GradientDrawable LIZIZ = T28.LIZIZ(1);
                Context context2 = createAvatarViewWithBackground$lambda$0.getContext();
                o.LJIIIIZZ(context2, "context");
                LIZIZ.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context2));
                createAvatarViewWithBackground$lambda$0.setBackground(LIZIZ);
            } else if (this.LJLJI && i == 0) {
                GradientDrawable LIZIZ2 = T28.LIZIZ(1);
                Context context3 = createAvatarViewWithBackground$lambda$0.getContext();
                o.LJIIIIZZ(context3, "context");
                LIZIZ2.setStroke(2, AnonymousClass636.LJIIIIZZ(R.attr.ch, context3));
                createAvatarViewWithBackground$lambda$0.setBackground(LIZIZ2);
            }
            int i5 = this.LJLJLJ;
            if (i5 != 14) {
                if (i5 != 16) {
                    if (i5 != 22) {
                        if (i5 != 32) {
                            if (i5 != 36) {
                                if (i5 != 40) {
                                    osz = new OSZ(Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLIL));
                                } else {
                                    osz = new OSZ(AnonymousClass391.LIZJ(40), AnonymousClass391.LIZJ(32));
                                }
                            } else {
                                osz = new OSZ(AnonymousClass391.LIZJ(36), AnonymousClass391.LIZJ(22));
                            }
                        } else {
                            osz = new OSZ(AnonymousClass391.LIZJ(32), AnonymousClass391.LIZJ(20));
                        }
                    } else {
                        osz = new OSZ(AnonymousClass391.LIZJ(22), AnonymousClass391.LIZJ(12));
                    }
                } else {
                    osz = new OSZ(AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(12));
                }
            } else {
                osz = new OSZ(AnonymousClass391.LIZJ(14), AnonymousClass391.LIZJ(12));
            }
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(intValue, intValue);
            if (C90193gN.LIZIZ(createAvatarViewWithBackground$lambda$0.getContext())) {
                layoutParams2.setMargins(0, 0, intValue2 * i, 0);
            } else {
                layoutParams2.setMargins(intValue2 * i, 0, 0, 0);
            }
            createAvatarViewWithBackground$lambda$0.setLayoutParams(layoutParams2);
            C62846OlW c62846OlW = (C62846OlW) createAvatarViewWithBackground$lambda$0.findViewById(R.id.abh);
            if (mutualUser != null) {
                urlModel = mutualUser.getAvatarMedium();
            }
            C78765Uvh.LJFF(c62846OlW, urlModel);
            view = createAvatarViewWithBackground$lambda$0;
        }
        return view;
    }
}
