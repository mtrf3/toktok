package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105664Cs extends PopupWindow {
    public final Activity LIZ;
    public final View LIZIZ;
    public final C105674Ct LIZJ;
    public InterfaceC105584Ck LIZLLL;
    public ImSysEmojiModel LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105664Cs(Activity activity, C4CM parent) {
        super(activity);
        o.LJIIIZ(parent, "parent");
        this.LIZ = activity;
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        C105674Ct c105674Ct = new C105674Ct();
        this.LIZJ = c105674Ct;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activity), R.layout.atz, parent, false);
        o.LJIIIIZZ(LLLLIILL, "from(activity).inflate(R…i_popupv2, parent, false)");
        this.LIZIZ = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.ftq);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        final int LIZIZ = C7MY.LIZIZ(3);
        final int LIZIZ2 = C7MY.LIZIZ(15);
        recyclerView.LJII(new AbstractC030309z(LIZIZ, LIZIZ2) { // from class: X.4Cu
            public final int LJLIL;
            public final int LJLILLLLZI;

            {
                this.LJLIL = LIZIZ;
                this.LJLILLLLZI = LIZIZ2;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                T28.LJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state");
                super.LJ(rect, view, recyclerView2, c0ac);
                if (RecyclerView.LJJJJIZL(view) == 1) {
                    rect.left = this.LJLILLLLZI;
                    rect.right = this.LJLIL;
                } else {
                    int i = this.LJLIL;
                    rect.left = i;
                    rect.right = i;
                }
            }
        }, -1);
        recyclerView.setAdapter(c105674Ct);
        setContentView(LLLLIILL);
    }

    public final void LIZ(ImSysEmojiModel imSysEmojiModel, MotionEvent event, View view) {
        boolean z;
        int i;
        int i2;
        final int i3;
        o.LJIIIZ(event, "event");
        if (imSysEmojiModel.getEmojiList() == null) {
            return;
        }
        ImSysEmojiModel imSysEmojiModel2 = this.LJ;
        if (imSysEmojiModel2 != null && imSysEmojiModel.getPosition() == imSysEmojiModel2.getPosition()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LJ = imSysEmojiModel;
            C105674Ct c105674Ct = this.LIZJ;
            c105674Ct.getClass();
            c105674Ct.LJLILLLLZI = imSysEmojiModel;
            c105674Ct.LJLJI = 0;
            List<C105714Cx> data = c105674Ct.getData();
            List<String> emojiList = imSysEmojiModel.getEmojiList();
            if (emojiList != null && !emojiList.isEmpty() && data != null) {
                data.clear();
                List<String> emojiList2 = imSysEmojiModel.getEmojiList();
                if (emojiList2 != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(emojiList2, 10));
                    Iterator<String> it = emojiList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boolean.valueOf(data.add(new C105714Cx(it.next()))));
                    }
                }
                c105674Ct.notifyDataSetChanged();
            }
            this.LIZJ.notifyDataSetChanged();
            if (this.LIZJ.getItemCount() == 1) {
                setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(61)));
                setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(61)));
                View view2 = this.LIZIZ;
                Context context = this.LIZIZ.getContext();
                o.LJIIIIZZ(context, "root.context");
                view2.setBackground(new C5FQ(getWidth(), getHeight(), context));
            } else {
                setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(255)));
                setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(61)));
                Rect rect = new Rect();
                if (view != null) {
                    view.getGlobalVisibleRect(rect);
                }
                int centerX = rect.centerX();
                Rect rect2 = new Rect();
                this.LIZ.getWindow().getDecorView().getGlobalVisibleRect(rect2);
                if (centerX < getWidth() / 2) {
                    i3 = centerX - (getWidth() / 2);
                } else if (rect2.right - centerX < getWidth() / 2) {
                    i3 = (getWidth() / 2) - (rect2.right - centerX);
                } else {
                    i3 = 0;
                }
                View view3 = this.LIZIZ;
                final Context context2 = this.LIZIZ.getContext();
                o.LJIIIIZZ(context2, "root.context");
                final int width = getWidth();
                final int height = getHeight();
                view3.setBackground(new C5FQ(context2, width, height, i3) { // from class: X.5FP
                    public final int LJI;
                    public final int LJII;
                    public final Paint LJIIIIZZ;
                    public final Path LJIIIZ;

                    @Override // X.C5FQ
                    public final int LIZJ() {
                        return this.LJII;
                    }

                    @Override // X.C5FQ
                    public final float LIZ(float f) {
                        return C32151Nz.LJIIZILJ(Float.valueOf(f)) + this.LJII + this.LJI;
                    }

                    @Override // X.C5FQ, android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                        o.LJIIIZ(canvas, "canvas");
                        super.draw(canvas);
                        this.LJIIIZ.rewind();
                        this.LJIIIZ.moveTo(C5FQ.LIZIZ(53.5f), C5FQ.LIZIZ(13.5f));
                        this.LJIIIZ.lineTo(C5FQ.LIZIZ(54.0f), C5FQ.LIZIZ(13.5f));
                        this.LJIIIZ.lineTo(C5FQ.LIZIZ(54.0f), C5FQ.LIZIZ(37.5f));
                        this.LJIIIZ.lineTo(C5FQ.LIZIZ(53.5f), C5FQ.LIZIZ(37.5f));
                        this.LJIIIZ.close();
                        canvas.drawPath(this.LJIIIZ, this.LJIIIIZZ);
                    }

                    {
                        super(width, height, context2);
                        int i4;
                        this.LJI = i3;
                        this.LJII = width / 2;
                        Paint paint = new Paint(1);
                        Integer LJI = C79045V0n.LJI(R.attr.dw, context2);
                        if (LJI != null) {
                            i4 = LJI.intValue();
                        } else {
                            i4 = 0;
                        }
                        paint.setColor(i4);
                        this.LJIIIIZZ = paint;
                        this.LJIIIZ = new Path();
                    }
                });
            }
        }
        int[] iArr = new int[2];
        this.LIZIZ.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        if (this.LIZIZ.getWidth() <= 0) {
            return;
        }
        int width2 = this.LIZIZ.getWidth();
        List<String> emojiList3 = imSysEmojiModel.getEmojiList();
        o.LJI(emojiList3);
        int size = width2 / emojiList3.size();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" event.rawX  :");
        LIZ.append(event.getRawX());
        LIZ.append(" x ");
        LIZ.append(i4);
        LIZ.append(" root:w ");
        LIZ.append(this.LIZIZ.getWidth());
        LIZ.append(' ');
        C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ));
        float f = i4;
        if (event.getRawX() <= f) {
            i = 0;
        } else if (event.getRawX() >= this.LIZIZ.getWidth() + i4) {
            List<String> emojiList4 = imSysEmojiModel.getEmojiList();
            o.LJI(emojiList4);
            i = emojiList4.size() - 1;
        } else {
            float rawX = event.getRawX() - f;
            List<String> emojiList5 = imSysEmojiModel.getEmojiList();
            if (emojiList5 != null) {
                int i5 = (int) (rawX / size);
                i = emojiList5.size() - 1;
                if (i5 <= i) {
                    i = i5;
                }
            } else {
                i = 0;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" cal  :");
            LIZ2.append(size);
            LIZ2.append("  left ");
            LIZ2.append(rawX);
            C34B.LIZIZ("EmojiPopUpWindow", X1D.LIZIZ(LIZ2));
        }
        C105674Ct c105674Ct2 = this.LIZJ;
        if (c105674Ct2.LJLJI != i) {
            if (i >= c105674Ct2.getData().size()) {
                i2 = c105674Ct2.getData().size() - 1;
            } else {
                i2 = i;
            }
            ((C105714Cx) ListProtector.get(c105674Ct2.getData(), c105674Ct2.LJLJI)).LIZIZ = false;
            ((C105714Cx) ListProtector.get(c105674Ct2.getData(), i2)).LIZIZ = true;
            c105674Ct2.LJLJI = i2;
            ImSysEmojiModel imSysEmojiModel3 = c105674Ct2.LJLILLLLZI;
            if (imSysEmojiModel3 != null) {
                imSysEmojiModel3.setPreviewEmoji(((C105714Cx) ListProtector.get(c105674Ct2.getData(), i2)).LIZ);
            }
            c105674Ct2.notifyDataSetChanged();
        }
        if (event.getAction() == 1) {
            InterfaceC105584Ck interfaceC105584Ck = this.LIZLLL;
            if (interfaceC105584Ck != null) {
                List<String> emojiList6 = imSysEmojiModel.getEmojiList();
                o.LJI(emojiList6);
                interfaceC105584Ck.LJLLILLLL(imSysEmojiModel, (String) ListProtector.get(emojiList6, i));
            }
            dismiss();
        }
    }
}
