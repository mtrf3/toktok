package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HQU {
    public Aweme LIZ;
    public CreativeInfo LIZIZ;
    public boolean LIZJ;
    public UgcTemplateSlot LJFF;
    public String LIZLLL = "ugc_template";
    public final List<UgcTemplateSlot> LJ = new ArrayList();
    public final List<List<UgcTemplateSlot>> LJI = new ArrayList();
    public final java.util.Map<Class<? extends InterfaceC44041HQf>, Object> LJII = new LinkedHashMap();
    public final MutableLiveData<Integer> LJIIIIZZ = new MutableLiveData<>();
    public List<UgcTemplateSlot> LJIIIZ = C61878OQg.INSTANCE;

    public String LIZIZ() {
        return null;
    }

    public final Aweme LIZ() {
        Aweme aweme = this.LIZ;
        if (aweme != null) {
            return aweme;
        }
        o.LJIJI("aweme");
        throw null;
    }

    public String LIZJ() {
        return this.LIZLLL;
    }

    public static AnchorCommonStruct LIZLLL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        for (AnchorCommonStruct anchorCommonStruct2 : anchors) {
            AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
            if (anchorCommonStruct3.getType() == 65 || anchorCommonStruct3.getType() == 78) {
                anchorCommonStruct = anchorCommonStruct2;
                break;
            }
        }
        return anchorCommonStruct;
    }

    public final <T extends InterfaceC44041HQf> T LJ(Class<T> cls) {
        Object obj = ((LinkedHashMap) this.LJII).get(cls);
        if (obj instanceof InterfaceC44041HQf) {
            return (T) obj;
        }
        return null;
    }

    public void LJFF(String str) {
        this.LIZLLL = str;
    }

    public final void LJI(int i) {
        List<UgcTemplateSlot> list;
        if (i >= 0 && i < ((ArrayList) this.LJ).size()) {
            Integer value = this.LJIIIIZZ.getValue();
            if (value == null || i != value.intValue()) {
                this.LJIIIIZZ.setValue(Integer.valueOf(i));
                Object obj = ListProtector.get(this.LJ, i);
                Iterator<List<UgcTemplateSlot>> it = this.LJI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        list = it.next();
                        if (list.contains(obj)) {
                            break;
                        }
                    } else {
                        list = null;
                        break;
                    }
                }
                List<UgcTemplateSlot> list2 = list;
                if (list2 == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                this.LJIIIZ = list2;
            }
        }
    }
}
