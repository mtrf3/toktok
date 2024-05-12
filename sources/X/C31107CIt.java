package X;

import Y.IDComparatorS33S0000000_5;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.CIt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31107CIt implements InterfaceC29937Boz {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public C31107CIt(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        HashMap<String, Integer> hashMap = C31106CIs.LIZLLL;
        if (!hashMap.isEmpty()) {
            ORZ.LLILII(new IDComparatorS33S0000000_5(11), C31106CIs.LJ);
            hashMap.clear();
        }
        DataChannelGlobal.LJLJJI.tv0(EmoteBitmapListChannel.class, C31106CIs.LIZ(this.LIZ));
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) C31106CIs.LJ).iterator();
        while (it.hasNext()) {
            hashSet.add(((EmoteModel) it.next()).emoteId);
        }
        if (!this.LIZIZ) {
            ArrayList<String> arrayList = C31106CIs.LJI;
            if (!arrayList.isEmpty()) {
                if (!arrayList.isEmpty()) {
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!hashSet.contains(it2.next())) {
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        C31106CIs.LJI.clear();
        DataChannelGlobal.LJLJJI.tv0(EmoteBaseInformationListChannel.class, C31106CIs.LIZ(this.LIZ));
        C31106CIs.LJIIIIZZ.put(Integer.valueOf(this.LIZ), EnumC31110CIw.LOAD_SUCCESS);
    }
}
