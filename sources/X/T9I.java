package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class T9I extends BaseAdapter {
    public final List<NewFaceStickerBean> LJLIL = new ArrayList();
    public final Context LJLILLLLZI;
    public int LJLJI;
    public final T9V LJLJJI;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<NewFaceStickerBean> list = this.LJLIL;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    public T9I(ActivityC45651qj activityC45651qj, C28791BRr c28791BRr) {
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJJI = c28791BRr;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        T9Q t9q;
        if (view == null) {
            LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLILLLLZI);
            this.LJLJJI.LIZIZ();
            view = C16880lQ.LLLLIILL(LLZIL, R.layout.bec, viewGroup, false);
            t9q = new T9Q();
            t9q.LIZ = view.findViewById(R.id.eiz);
            t9q.LIZIZ = (C62846OlW) view.findViewById(R.id.kiv);
            view.setTag(t9q);
        } else {
            t9q = (T9Q) view.getTag();
        }
        t9q.LIZIZ.getHierarchy().LJIJ(R.drawable.c6y);
        C78765Uvh.LJFF(t9q.LIZIZ, ((NewFaceStickerBean) ListProtector.get(this.LJLIL, i)).iconUrl);
        if (((NewFaceStickerBean) ListProtector.get(this.LJLIL, i)).mIsSelect) {
            t9q.LIZ.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t9q.LIZ, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        } else {
            t9q.LIZ.setVisibility(4);
        }
        return view;
    }
}
