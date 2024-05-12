package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes29.dex */
public class ZXH extends ArrayAdapter<ZY4> {
    public final float LJLIL;
    public final /* synthetic */ DialogC90914ZmA LJLILLLLZI;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZXH(DialogC90914ZmA dialogC90914ZmA, Context context, List<ZY4> list) {
        super(context, 0, list);
        this.LJLILLLLZI = dialogC90914ZmA;
        this.LJLIL = ZXT.LIZLLL(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int i3 = 0;
        if (view == null) {
            view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.p, viewGroup, false);
        } else {
            DialogC90914ZmA dialogC90914ZmA = this.LJLILLLLZI;
            dialogC90914ZmA.getClass();
            DialogC90914ZmA.LJJII(view.findViewById(R.id.bz), dialogC90914ZmA.LLIIL);
            View findViewById = view.findViewById(R.id.bo);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i4 = dialogC90914ZmA.LLIIJLIL;
            layoutParams.width = i4;
            layoutParams.height = i4;
            findViewById.setLayoutParams(layoutParams);
        }
        ZY4 item = getItem(i);
        if (item != null) {
            boolean z = item.LJI;
            TextView textView = (TextView) view.findViewById(R.id.bd);
            textView.setEnabled(z);
            textView.setText(item.LIZLLL);
            C90572Zge c90572Zge = (C90572Zge) view.findViewById(R.id.bp);
            ZXT.LJIIJJI(viewGroup.getContext(), c90572Zge, this.LJLILLLLZI.LLI);
            c90572Zge.setTag(item);
            ((HashMap) this.LJLILLLLZI.LLIIZ).put(item, c90572Zge);
            c90572Zge.LIZ(!z);
            c90572Zge.setEnabled(z);
            if (z) {
                if (this.LJLILLLLZI.LLF && item.LJIILIIL == 1) {
                    c90572Zge.setMax(item.LJIILL);
                    c90572Zge.setProgress(item.LJIILJJIL);
                    c90572Zge.setOnSeekBarChangeListener(this.LJLILLLLZI.LLIIIZ);
                } else {
                    c90572Zge.setMax(100);
                    c90572Zge.setProgress(100);
                    c90572Zge.setEnabled(false);
                }
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.bo);
            if (z) {
                i2 = 255;
            } else {
                i2 = (int) (this.LJLIL * 255.0f);
            }
            imageView.setAlpha(i2);
            View findViewById2 = view.findViewById(R.id.bz);
            if (((HashSet) this.LJLILLLLZI.LLIIIJ).contains(item)) {
                i3 = 4;
            }
            findViewById2.setVisibility(i3);
            java.util.Set<ZY4> set = this.LJLILLLLZI.LLIIII;
            if (set != null && ((HashSet) set).contains(item)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }
}
