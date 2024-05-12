package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* loaded from: classes14.dex */
public final class V1H implements C15X {
    public final /* synthetic */ InterfaceC73573Su9 LJLIL;
    public final /* synthetic */ V1G LJLILLLLZI;

    public V1H(V1G v1g, C73433Srt c73433Srt) {
        this.LJLILLLLZI = v1g;
        this.LJLIL = c73433Srt;
    }

    @Override // X.C15X
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        this.LJLIL.onNext(view);
        LinkedList<View> linkedList = this.LJLILLLLZI.LJLJI.storage.get(Integer.valueOf(i));
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.LJLILLLLZI.LJLJI.storage.put(Integer.valueOf(i), linkedList);
        }
        linkedList.add(view);
    }
}
