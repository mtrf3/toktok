package X;

import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.EffectLocation;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.EffectLocationMessage;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.HCo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43686HCo implements MessageCenter.Listener {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public boolean LJLJI = true;
    public final LinkedHashMap<String, List<NormalTrackTimeStamp>> LJLJJI = new LinkedHashMap<>();
    public final LinkedHashMap<String, ExtraParams> LJLJJL = new LinkedHashMap<>();
    public int LJLJJLL = 0;
    public boolean LJLJL = false;

    public C43686HCo() {
        MessageCenter.init();
        MessageCenter.addListener(this);
    }

    public final void LIZIZ(int i) {
        if (!this.LJLJI) {
            return;
        }
        Iterator<Map.Entry<String, List<NormalTrackTimeStamp>>> it = this.LJLJJI.entrySet().iterator();
        while (it.hasNext()) {
            List<NormalTrackTimeStamp> value = it.next().getValue();
            if (!C79004UzY.LJJIFFI(value)) {
                Iterator<NormalTrackTimeStamp> it2 = value.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getPts() > i) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public final void LIZ(int i, ExtraParams extraParams) {
        if (!this.LJLJI || C38354F3m.LJ(this.LJLIL)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<NormalTrackTimeStamp> list = this.LJLJJI.get(this.LJLILLLLZI);
        if (!C79004UzY.LJJIFFI(list)) {
            arrayList.addAll(list);
        }
        try {
            EffectLocationMessage effectLocationMessage = (EffectLocationMessage) C44172HVg.LJIJI.getRetrofitFactoryGson().LJI(this.LJLIL, EffectLocationMessage.class);
            if (effectLocationMessage != null && !C79004UzY.LJJIFFI(effectLocationMessage.locations)) {
                LinkedList linkedList = new LinkedList();
                for (EffectLocation effectLocation : effectLocationMessage.locations) {
                    NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                    normalTrackTimeStamp.setPts(i);
                    normalTrackTimeStamp.setWidth(effectLocation.getW());
                    normalTrackTimeStamp.setHeight(effectLocation.getH());
                    normalTrackTimeStamp.setX(effectLocation.getX());
                    normalTrackTimeStamp.setY(effectLocation.getY());
                    normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                    normalTrackTimeStamp.setRotation(effectLocation.getR());
                    linkedList.add(normalTrackTimeStamp);
                }
                arrayList.addAll(linkedList);
                this.LJLJJI.put(this.LJLILLLLZI, arrayList);
                this.LJLJJL.put(this.LJLILLLLZI, extraParams);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 28) {
            this.LJLIL = str;
            if (!this.LJLJL && !TextUtils.equals(str, "{\"locations\":[]}")) {
                this.LJLJL = true;
            }
        }
    }
}
