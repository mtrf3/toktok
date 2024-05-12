package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0PO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PO extends FrameLayout {
    public String LJLIL;
    public final C30711Il LJLILLLLZI;
    public final RecyclerView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PO(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        String panelName = C0TY.LIZIZ;
        this.LJLIL = panelName;
        o.LJIIIIZZ(panelName, "panelName");
        C30711Il c30711Il = new C30711Il(panelName);
        this.LJLILLLLZI = c30711Il;
        FrameLayout.inflate(context, R.layout.dil, this);
        findViewById(R.id.j7n).getBackground().setAlpha(255);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fhb);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(c30711Il);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.LJLJI = recyclerView;
    }

    public final void LIZ(LiveEffect liveEffect) {
        LiveEffect liveEffect2;
        List<? extends LiveEffect> list;
        LiveEffect liveEffect3;
        int i;
        if ((C77412UZs.LJIL(liveEffect) || (liveEffect != null && C77412UZs.LJJ(liveEffect))) && (liveEffect2 = (LiveEffect) DataChannelGlobal.LJLJJI.mv0(C2BW.class)) != null && (list = liveEffect2.subStickers) != null && (!list.isEmpty())) {
            C30711Il c30711Il = this.LJLILLLLZI;
            if (C77412UZs.LJIL(liveEffect)) {
                liveEffect3 = (LiveEffect) ListProtector.get(list, 0);
            } else {
                liveEffect3 = liveEffect;
            }
            c30711Il.LJLJJI = liveEffect3;
            C30711Il c30711Il2 = this.LJLILLLLZI;
            ((ArrayList) c30711Il2.LJLJJLL).clear();
            ((ArrayList) c30711Il2.LJLJJLL).addAll(list);
            c30711Il2.notifyDataSetChanged();
            C30711Il c30711Il3 = this.LJLILLLLZI;
            if (liveEffect == null) {
                c30711Il3.getClass();
            } else {
                Iterator it = ((ArrayList) c30711Il3.LJLJJLL).iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((LiveEffect) it.next()).effectId == liveEffect.effectId) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= 0) {
                int intValue = valueOf.intValue();
                RecyclerView recyclerView = this.LJLJI;
                if (recyclerView != null) {
                    recyclerView.LJLI(intValue);
                }
            }
        }
    }

    public final void setComposerManager(C0WF c0wf) {
        this.LJLILLLLZI.LJLJI = c0wf;
    }
}
