package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Dmn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34897Dmn {
    public static final m LIZ = new m();

    public static List LIZ() {
        Object obj;
        LinkedList linkedList;
        g LJJIJIIJI;
        try {
            m mVar = (m) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_font_interception", m.class, LIZ);
            if (mVar != null && (LJJIJIIJI = mVar.LJJIJIIJI("regex")) != null) {
                linkedList = new LinkedList();
                Iterator<j> it = LJJIJIIJI.iterator();
                while (it.hasNext()) {
                    linkedList.add(PatternProtector.compile(it.next().LJJIFFI()));
                }
            } else {
                linkedList = null;
            }
            C3C5.m7constructorimpl(linkedList);
            obj = linkedList;
        } catch (Throwable th) {
            Object LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
            obj = LIZ2;
        }
        return (List) (C3C5.m12isFailureimpl(obj) ? null : obj);
    }
}
