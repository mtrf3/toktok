package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32161Oa extends C0Y5 {
    public InterfaceC42231lD LJIIIIZZ;

    @Override // X.C0Y5
    public final void LIZJ() {
        InterfaceC42231lD interfaceC42231lD = this.LJIIIIZZ;
        if (interfaceC42231lD != null) {
            ((C31082CHu) interfaceC42231lD).LIZ.LLI.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32161Oa(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C0Y5
    public final View LIZIZ(ViewGroup viewGroup) {
        int i;
        Context context = this.LIZ;
        DataChannel dataChannel = this.LIZIZ;
        boolean z = this.LIZLLL;
        InterfaceC42231lD interfaceC42231lD = this.LJIIIIZZ;
        C28317B9l c28317B9l = new C28317B9l(context);
        c28317B9l.setDataChannel(dataChannel);
        c28317B9l.setOnEmojiSelectListener(interfaceC42231lD);
        if (z) {
            i = 7;
        } else {
            i = 12;
        }
        c28317B9l.LJLJI = i;
        RecyclerView recyclerView = (RecyclerView) c28317B9l.findViewById(R.id.ftq);
        C28312B9g c28312B9g = new C28312B9g(c28317B9l.getContext());
        c28317B9l.LJLIL = c28312B9g;
        c28312B9g.LJLJJI = c28317B9l;
        recyclerView.setAdapter(c28312B9g);
        c28317B9l.getContext();
        recyclerView.setLayoutManager(new SSGridLayoutManager(c28317B9l.LJLJI, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(36);
        List LJ = C1FC.LIZIZ().LJ();
        if (!C32151Nz.LJJIIJZLJL(LJ)) {
            ArrayList arrayList = new ArrayList(LJ);
            C28312B9g c28312B9g2 = c28317B9l.LJLIL;
            ((ArrayList) c28312B9g2.LJLJI).clear();
            if (!arrayList.isEmpty()) {
                ((ArrayList) c28312B9g2.LJLJI).addAll(arrayList);
            }
            c28317B9l.LJLIL.notifyDataSetChanged();
        }
        return c28317B9l;
    }

    @Override // X.C0Y5
    public final void LIZLLL(boolean z) {
        if (z) {
            C0Y4.LIZ("livesdk_emoji_show");
        }
    }
}
