package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C134965Rk extends AbstractC168846jw<EffectPointModel> {
    public final C169096kL LIZJ;
    public final int LIZLLL = 2;
    public final int LJ = 100;

    @Override // X.AbstractC168846jw
    public final void LJIIIIZZ() {
        ((AwemeDraft) getParams().LIZLLL).LJ().removeAll(this.LIZ);
    }

    @Override // X.AbstractC168846jw
    public List<EffectPointModel> LJIIJ() {
        List<EffectPointModel> LJ = ((AwemeDraft) getParams().LIZLLL).LJ();
        ArrayList arrayList = new ArrayList();
        for (EffectPointModel effectPointModel : LJ) {
            EffectPointModel effectPointModel2 = effectPointModel;
            if (!o.LJ(effectPointModel2.getKey(), "1") && !o.LJ(effectPointModel2.getKey(), "2") && !o.LJ(effectPointModel2.getKey(), "3") && (TextUtils.equals(effectPointModel2.getCategory(), "motion") || !C39579Fg7.LIZIZ(effectPointModel2.getResDir()))) {
                arrayList.add(effectPointModel);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC168706ji
    public int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC168706ji
    public C169096kL getParams() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC168706ji
    public int getPriority() {
        return this.LJ;
    }

    public C134965Rk(C169096kL c169096kL) {
        this.LIZJ = c169096kL;
    }

    @Override // X.AbstractC168846jw
    public final String LJIIIZ(EffectPointModel effectPointModel) {
        EffectPointModel model = effectPointModel;
        o.LJIIIZ(model, "model");
        String key = model.getKey();
        o.LJIIIIZZ(key, "model.key");
        return key;
    }

    @Override // X.AbstractC168846jw
    public final void LJI(Effect effect, EffectPointModel effectPointModel) {
        EffectPointModel model = effectPointModel;
        o.LJIIIZ(model, "model");
        List<String> tags = effect.getTags();
        int i = 0;
        if (tags != null) {
            Iterator<String> it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (s.LJJJLZIJ(next, "duration:", false)) {
                    String substring = next.substring(9);
                    o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                    i = CastIntegerProtector.parseInt(substring);
                    break;
                }
            }
        }
        model.setDuration(i);
        model.setExtra(effect.getExtra());
        model.setKey(effect.getEffectId());
        model.setName(effect.getName());
        model.setResDir(effect.getUnzipPath());
    }
}
