package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZXE implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ DialogC90914ZmA LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        ImageView.ScaleType scaleType;
        this.LJLILLLLZI.LJLZ.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        DialogC90914ZmA dialogC90914ZmA = this.LJLILLLLZI;
        if (dialogC90914ZmA.LLJI) {
            dialogC90914ZmA.LLJIJIL = true;
            return;
        }
        boolean z3 = this.LJLIL;
        int i3 = dialogC90914ZmA.LLFF.getLayoutParams().height;
        DialogC90914ZmA.LJJII(dialogC90914ZmA.LLFF, -1);
        dialogC90914ZmA.LJJIJ(dialogC90914ZmA.LJIL());
        View decorView = dialogC90914ZmA.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dialogC90914ZmA.getWindow().getAttributes().width, 1073741824), 0);
        DialogC90914ZmA.LJJII(dialogC90914ZmA.LLFF, i3);
        if ((dialogC90914ZmA.LJZI.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) dialogC90914ZmA.LJZI.getDrawable()).getBitmap()) != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width >= height) {
                i = (int) (((dialogC90914ZmA.LJLL * height) / width) + 0.5f);
            } else {
                i = (int) (((dialogC90914ZmA.LJLL * 9.0f) / 16.0f) + 0.5f);
            }
            ImageView imageView = dialogC90914ZmA.LJZI;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        } else {
            i = 0;
        }
        int LJJIFFI = dialogC90914ZmA.LJJIFFI(dialogC90914ZmA.LJIL());
        int size = ((ArrayList) dialogC90914ZmA.LLII).size();
        if (dialogC90914ZmA.LJLJJLL.LJ()) {
            i2 = dialogC90914ZmA.LLIIL * dialogC90914ZmA.LJLJJLL.LIZIZ().size();
        } else {
            i2 = 0;
        }
        if (size > 0) {
            i2 += dialogC90914ZmA.LLIILZL;
        }
        int min = Math.min(i2, dialogC90914ZmA.LLIILII);
        if (!dialogC90914ZmA.LLJ) {
            min = 0;
        }
        int max = Math.max(i, min) + LJJIFFI;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height2 = rect.height() - (dialogC90914ZmA.LJLLLLLL.getMeasuredHeight() - dialogC90914ZmA.LJLZ.getMeasuredHeight());
        if (i > 0 && max <= height2) {
            dialogC90914ZmA.LJZI.setVisibility(0);
            DialogC90914ZmA.LJJII(dialogC90914ZmA.LJZI, i);
        } else {
            if (dialogC90914ZmA.LLI.getLayoutParams().height + dialogC90914ZmA.LLFF.getMeasuredHeight() >= dialogC90914ZmA.LJLZ.getMeasuredHeight()) {
                dialogC90914ZmA.LJZI.setVisibility(8);
            }
            max = min + LJJIFFI;
            i = 0;
        }
        if (dialogC90914ZmA.LJIL() && max <= height2) {
            dialogC90914ZmA.LLFFF.setVisibility(0);
        } else {
            dialogC90914ZmA.LLFFF.setVisibility(8);
        }
        if (dialogC90914ZmA.LLFFF.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        dialogC90914ZmA.LJJIJ(z);
        if (dialogC90914ZmA.LLFFF.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int LJJIFFI2 = dialogC90914ZmA.LJJIFFI(z2);
        int max2 = Math.max(i, min) + LJJIFFI2;
        if (max2 > height2) {
            min -= max2 - height2;
        } else {
            height2 = max2;
        }
        dialogC90914ZmA.LLFF.clearAnimation();
        dialogC90914ZmA.LLI.clearAnimation();
        dialogC90914ZmA.LJLZ.clearAnimation();
        if (z3) {
            dialogC90914ZmA.LJIJJLI(LJJIFFI2, dialogC90914ZmA.LLFF);
            dialogC90914ZmA.LJIJJLI(min, dialogC90914ZmA.LLI);
            dialogC90914ZmA.LJIJJLI(height2, dialogC90914ZmA.LJLZ);
        } else {
            DialogC90914ZmA.LJJII(dialogC90914ZmA.LLFF, LJJIFFI2);
            DialogC90914ZmA.LJJII(dialogC90914ZmA.LLI, min);
            DialogC90914ZmA.LJJII(dialogC90914ZmA.LJLZ, height2);
        }
        DialogC90914ZmA.LJJII(dialogC90914ZmA.LJLLLL, rect.height());
        List<ZY4> LIZIZ = dialogC90914ZmA.LJLJJLL.LIZIZ();
        if (LIZIZ.isEmpty()) {
            ((ArrayList) dialogC90914ZmA.LLII).clear();
            dialogC90914ZmA.LLIFFJFJJ.notifyDataSetChanged();
            return;
        }
        if (new HashSet(dialogC90914ZmA.LLII).equals(new HashSet(LIZIZ))) {
            dialogC90914ZmA.LLIFFJFJJ.notifyDataSetChanged();
            return;
        }
        if (z3) {
            ZX7 zx7 = dialogC90914ZmA.LLI;
            ZXH zxh = dialogC90914ZmA.LLIFFJFJJ;
            hashMap = new HashMap();
            int firstVisiblePosition = zx7.getFirstVisiblePosition();
            for (int i4 = 0; i4 < zx7.getChildCount(); i4++) {
                ZY4 item = zxh.getItem(firstVisiblePosition + i4);
                View childAt = zx7.getChildAt(i4);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
            Context context = dialogC90914ZmA.LJLJL;
            ZX7 zx72 = dialogC90914ZmA.LLI;
            ZXH zxh2 = dialogC90914ZmA.LLIFFJFJJ;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = zx72.getFirstVisiblePosition();
            for (int i5 = 0; i5 < zx72.getChildCount(); i5++) {
                ZY4 item2 = zxh2.getItem(firstVisiblePosition2 + i5);
                View childAt2 = zx72.getChildAt(i5);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
            }
        } else {
            hashMap = null;
            hashMap2 = null;
        }
        List<ZY4> list = dialogC90914ZmA.LLII;
        HashSet hashSet = new HashSet(LIZIZ);
        hashSet.removeAll(list);
        dialogC90914ZmA.LLIIII = hashSet;
        HashSet hashSet2 = new HashSet(dialogC90914ZmA.LLII);
        hashSet2.removeAll(LIZIZ);
        dialogC90914ZmA.LLIIIILZ = hashSet2;
        ((ArrayList) dialogC90914ZmA.LLII).addAll(0, dialogC90914ZmA.LLIIII);
        ((ArrayList) dialogC90914ZmA.LLII).removeAll(dialogC90914ZmA.LLIIIILZ);
        dialogC90914ZmA.LLIFFJFJJ.notifyDataSetChanged();
        if (z3 && dialogC90914ZmA.LLJ && ((HashSet) dialogC90914ZmA.LLIIII).size() + ((HashSet) dialogC90914ZmA.LLIIIILZ).size() > 0) {
            dialogC90914ZmA.LLI.setEnabled(false);
            dialogC90914ZmA.LLI.requestLayout();
            dialogC90914ZmA.LLJI = true;
            dialogC90914ZmA.LLI.getViewTreeObserver().addOnGlobalLayoutListener(new ZXJ(dialogC90914ZmA, hashMap, hashMap2));
            return;
        }
        dialogC90914ZmA.LLIIII = null;
        dialogC90914ZmA.LLIIIILZ = null;
    }

    public ZXE(DialogC90914ZmA dialogC90914ZmA, boolean z) {
        this.LJLILLLLZI = dialogC90914ZmA;
        this.LJLIL = z;
    }
}
