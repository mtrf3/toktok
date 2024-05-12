package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ONi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61802ONi implements InterfaceC50599JtT {
    public final /* synthetic */ C61800ONg LJLIL;
    public final /* synthetic */ ArrayList<Option> LJLILLLLZI;
    public final /* synthetic */ C61804ONk LJLJI;

    @Override // X.InterfaceC50599JtT
    public final void LIZ(int i, View view) {
        String str;
        if (this.LJLIL.LJJIII) {
            return;
        }
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIIZZ(obj, "data[position]");
        Option option = (Option) obj;
        boolean z = true;
        boolean z2 = !option.isSelected();
        if (z2) {
            this.LJLIL.LIZ.put(Integer.valueOf(option.getId()), option);
        } else if (this.LJLIL.LIZ.containsKey(Integer.valueOf(option.getId()))) {
            this.LJLIL.LIZ.remove(Integer.valueOf(option.getId()));
        }
        if (!this.LJLIL.LIZ.isEmpty()) {
            SY4 sy4 = this.LJLIL.LJIJJ;
            if (sy4 != null) {
                sy4.setEnabled(true);
                sy4.setClickable(true);
                sy4.setButtonVariant(0);
            }
            C61800ONg c61800ONg = this.LJLIL;
            Iterator it = ((LinkedHashMap) c61800ONg.LIZ).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((Number) entry.getKey()).intValue();
                    if (((Option) entry.getValue()).getType() == EnumC46455ILb.WITH_INPUT.getType()) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            c61800ONg.LJFF(z);
        } else {
            this.LJLIL.LIZJ(false);
            this.LJLIL.LJFF(false);
        }
        option.setSelected(z2);
        this.LJLJI.notifyDataSetChanged();
        C61800ONg c61800ONg2 = this.LJLIL;
        c61800ONg2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : ((LinkedHashMap) c61800ONg2.LIZ).entrySet()) {
            ((Number) entry2.getKey()).intValue();
            arrayList.add(entry2.getValue());
        }
        C61815ONv c61815ONv = new C61815ONv();
        c61815ONv.LIZIZ = false;
        c61815ONv.LIZ = c61800ONg2.LJII;
        c61815ONv.LIZJ = arrayList;
        C61798ONe LIZ = C55016LiW.LIZ();
        Aweme aweme = c61800ONg2.LJIIIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.LJ(str, c61815ONv);
    }

    public C61802ONi(C61800ONg c61800ONg, ArrayList<Option> arrayList, C61804ONk c61804ONk) {
        this.LJLIL = c61800ONg;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = c61804ONk;
    }
}
