package X;

import Y.IDRunnableS0S1200000;
import Y.IDRunnableS85S0100000;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectResolutionAdaptionSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42681lw implements InterfaceC31981Ni {
    public static final C5H3<C42681lw> LJIIZILJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C515320n.LJLIL);
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C08780Wc LJ;
    public final List<C0WD> LJFF = new CopyOnWriteArrayList();
    public final List<C0WC> LJI = new ArrayList();
    public final List<C12930f3> LJII = new ArrayList();
    public final List<C12930f3> LJIIIIZZ = new ArrayList();
    public final List<C12930f3> LJIIIZ = new ArrayList();
    public final java.util.Map<String, List<LiveEffect>> LJIIJ = new HashMap();
    public final ArrayList<C12930f3> LJIIJJI = new ArrayList<>();
    public boolean LJIIL = true;
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C515420o.LJLIL);
    public final Handler LJIILJJIL = new Handler(C16880lQ.LLJJJJ());
    public final IDRunnableS85S0100000 LJIILL = new IDRunnableS85S0100000(this, 84);
    public final IDRunnableS85S0100000 LJIILLIIL = new IDRunnableS85S0100000(this, 83);

    @Override // X.InterfaceC31981Ni
    public final void LJJIIJZLJL() {
        LJJJJ(true);
    }

    public static void LJJIJLIJ() {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            List<LiveEffect> list = C17250m1.LIZ().LIZ;
            Integer savedIndex = InterfaceC30442Bx8.LJIJI.LIZJ();
            o.LJIIIIZZ(savedIndex, "savedIndex");
            if (savedIndex.intValue() >= 0) {
                ArrayList arrayList = (ArrayList) list;
                if (savedIndex.intValue() < arrayList.size() && o.LJ(((LiveEffect) ListProtector.get(arrayList, savedIndex.intValue())).getResourceId(), CardStruct.IStatusCode.DEFAULT)) {
                    Iterator it = ((ArrayList) C17250m1.LIZ().LIZJ).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC08050Th) it.next()).LIZIZ(0);
                    }
                }
            }
        }
    }

    @Override // X.C0WF
    public final void LJIILIIL() {
        C0TX.LIZIZ("refresh Sticker");
        this.LJIIJJI.clear();
        ((ArrayList) this.LJIIIIZZ).clear();
        LJJJJ(true);
    }

    @Override // X.InterfaceC31981Ni
    public final void LJJI() {
        LJJJ("guest_linkmic", false);
    }

    @Override // X.InterfaceC31981Ni
    public final void LJJIFFI() {
        String str;
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc == null || (str = c08780Wc.LJFF) == null) {
            str = "broadcast";
        }
        LJIJI(str, false);
    }

    public final void LJJIJL() {
        String str;
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJ;
            if (!c48459J0d.LIZJ().booleanValue()) {
                List<LiveEffect> list = C17250m1.LIZ().LIZ;
                String LIZ = C0TY.LIZ();
                Integer savedIndex = InterfaceC30442Bx8.LJIJI.LIZJ();
                o.LJIIIIZZ(savedIndex, "savedIndex");
                if (savedIndex.intValue() >= 0) {
                    ArrayList arrayList = (ArrayList) list;
                    if (savedIndex.intValue() < arrayList.size()) {
                        c48459J0d.LIZ(Boolean.TRUE);
                        LiveEffect filterModel = (LiveEffect) ListProtector.get(arrayList, savedIndex.intValue());
                        if (!C17250m1.LIZ().LJIIIZ(filterModel)) {
                            C1VH LIZ2 = C17250m1.LIZ();
                            LIZ2.getClass();
                            o.LJIIIZ(filterModel, "filterModel");
                            LIZ2.LJII.hv0(filterModel, new IDqS172S0200000(LIZ2, filterModel, 62));
                        }
                        InterfaceC30442Bx8.LJIL.LIZ(filterModel.getResourceId());
                        if (!filterModel.isNone()) {
                            float LJII = C17250m1.LIZ().LJII(filterModel);
                            LJJIJIIJI(LIZ, filterModel, false, true, InterfaceC30442Bx8.LLLZLZ.LIZJ());
                            LiveEffect.ComposerConfig smallItemConfig = filterModel.getSmallItemConfig();
                            if (smallItemConfig == null || (str = smallItemConfig.tag) == null) {
                                str = "";
                            }
                            LJJJJI(LIZ, filterModel, str, LJII, null);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C0WF
    public final java.util.Map<String, java.util.Map<String, LiveEffect>> Z5() {
        Object obj;
        HashMap hashMap = new HashMap();
        List<C12930f3> list = this.LJII;
        ArrayList arrayList = new ArrayList();
        for (C12930f3 c12930f3 : list) {
            C12930f3 c12930f32 = c12930f3;
            if (((HashMap) this.LJIIJ).containsKey(c12930f32.LIZ) && c12930f32.LJII) {
                arrayList.add(c12930f3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12930f3 c12930f33 = (C12930f3) it.next();
            if (!hashMap.containsKey(c12930f33.LIZ)) {
                hashMap.put(c12930f33.LIZ, new HashMap());
            }
            Object obj2 = hashMap.get(c12930f33.LIZ);
            o.LJI(obj2);
            java.util.Map map = (java.util.Map) obj2;
            if (!map.containsKey(c12930f33.LIZIZ)) {
                List list2 = (List) ((HashMap) this.LJIIJ).get(c12930f33.LIZ);
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (o.LJ(((LiveEffect) obj).getResourceId(), c12930f33.LIZIZ)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    LiveEffect liveEffect = (LiveEffect) obj;
                    if (liveEffect != null) {
                        map.put(liveEffect.getResourceId(), liveEffect);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // X.InterfaceC31981Ni
    public final boolean isInitialized() {
        if (this.LJ != null) {
            return true;
        }
        return false;
    }

    @Override // X.C0WF
    public final void release() {
        String str;
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc == null || (str = c08780Wc.LJFF) == null) {
            str = "broadcast";
        }
        LJJJ(str, true);
    }

    @Override // X.C0WF
    public final String LJI() {
        return this.LIZLLL;
    }

    @Override // X.C0WF
    public final String LJII() {
        return this.LIZJ;
    }

    @Override // X.C0WF
    public final String LJIILLIIL() {
        return this.LIZIZ;
    }

    @Override // X.C0WF
    public final List<LiveEffect> LIZ(String str) {
        List<LiveEffect> list;
        LiveEffect liveEffect;
        float f;
        Float f2;
        HashMap LIZ = C1R5.LIZ(str, "panel");
        if (!this.LJIIJ.containsKey(str)) {
            return ORZ.LLJI(LIZ.values());
        }
        List<C12930f3> list2 = this.LJII;
        ArrayList arrayList = new ArrayList();
        for (C12930f3 c12930f3 : list2) {
            C12930f3 c12930f32 = c12930f3;
            if (o.LJ(c12930f32.LIZ, str) && this.LJIIJ.containsKey(c12930f32.LIZ) && c12930f32.LJII) {
                arrayList.add(c12930f3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12930f3 c12930f33 = (C12930f3) it.next();
            if (!LIZ.containsKey(c12930f33.LIZIZ) && (list = this.LJIIJ.get(str)) != null) {
                Iterator<LiveEffect> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        liveEffect = it2.next();
                        if (o.LJ(liveEffect.getResourceId(), c12930f33.LIZIZ)) {
                            break;
                        }
                    } else {
                        liveEffect = null;
                        break;
                    }
                }
                LiveEffect liveEffect2 = liveEffect;
                if (liveEffect2 != null) {
                    LIZ.put(liveEffect2.getResourceId(), liveEffect2);
                    for (LiveEffect.ComposerConfig composerConfig : liveEffect2.composerConfigList) {
                        C12940f4 c12940f4 = (C12940f4) ORZ.LJLLLL(c12930f33.LJI);
                        if (c12940f4 != null && (f2 = c12940f4.LIZIZ) != null) {
                            f = f2.floatValue();
                        } else {
                            f = 0.0f;
                        }
                        composerConfig.LIZ = C12920f2.LIZIZ(liveEffect2, f);
                    }
                }
            }
        }
        return ORZ.LLJI(LIZ.values());
    }

    @Override // X.C0WF
    public final void LIZJ(String str) {
        this.LIZJ = str;
    }

    @Override // X.C0WF
    public final void LIZLLL(String panel) {
        o.LJIIIZ(panel, "panel");
        List<C12930f3> list = this.LJII;
        ArrayList arrayList = new ArrayList();
        for (C12930f3 c12930f3 : list) {
            if (o.LJ(c12930f3.LIZ, panel)) {
                arrayList.add(c12930f3);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12930f3 c12930f32 = (C12930f3) it.next();
            List list2 = (List) ((HashMap) this.LJIIJ).get(c12930f32.LIZ);
            Object obj = null;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (o.LJ(((LiveEffect) next).getResourceId(), c12930f32.LIZIZ)) {
                            obj = next;
                            break;
                        }
                    }
                }
            }
            arrayList2.add(obj);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LiveEffect liveEffect = (LiveEffect) it3.next();
            if (liveEffect != null) {
                LJJJI(liveEffect, panel, true);
            }
        }
    }

    @Override // X.InterfaceC31981Ni
    public final List<LiveEffect> LJIIIIZZ(String str) {
        List list;
        Object obj;
        HashMap LIZ = C1R5.LIZ(str, "panel");
        if (!((HashMap) this.LJIIJ).containsKey(str)) {
            return ORZ.LLJI(LIZ.values());
        }
        List<C12930f3> list2 = this.LJII;
        ArrayList arrayList = new ArrayList();
        for (C12930f3 c12930f3 : list2) {
            C12930f3 c12930f32 = c12930f3;
            if (o.LJ(c12930f32.LIZ, str)) {
                if (((HashMap) this.LJIIJ).containsKey(c12930f32.LIZ)) {
                    arrayList.add(c12930f3);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12930f3 c12930f33 = (C12930f3) it.next();
            if (!LIZ.containsKey(c12930f33.LIZIZ) && (list = (List) ((HashMap) this.LJIIJ).get(str)) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (o.LJ(((LiveEffect) obj).getResourceId(), c12930f33.LIZIZ)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LiveEffect liveEffect = (LiveEffect) obj;
                if (liveEffect != null) {
                    LIZ.put(liveEffect.getResourceId(), liveEffect);
                }
            }
        }
        return ORZ.LLJI(LIZ.values());
    }

    @Override // X.C0WF
    public final void LJIIIZ(C0WD listener) {
        o.LJIIIZ(listener, "listener");
        if (!((CopyOnWriteArrayList) this.LJFF).contains(listener)) {
            ((CopyOnWriteArrayList) this.LJFF).add(listener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    @Override // X.InterfaceC31981Ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r6) {
        /*
            r5 = this;
            java.util.List<X.0f3> r0 = r5.LJII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L8:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L75
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0f3 r0 = (X.C12930f3) r0
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = r6.getResourceId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L8
        L22:
            X.0f3 r2 = (X.C12930f3) r2
            if (r2 == 0) goto L73
            java.util.List<X.0f4> r0 = r2.LJI
            if (r0 == 0) goto L73
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0f4 r0 = (X.C12940f4) r0
            java.lang.String r1 = r0.LIZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = r6.getSmallItemConfig()
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.tag
        L47:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L30
            r4 = r2
        L4e:
            X.0f4 r4 = (X.C12940f4) r4
            if (r4 == 0) goto L73
            java.lang.Float r0 = r4.LIZIZ
            if (r0 == 0) goto L73
            float r2 = r0.floatValue()
        L5a:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = r6.getSmallItemConfig()
            r1 = 0
            if (r0 == 0) goto L6f
            int r0 = r0.LIZIZ
        L63:
            float r0 = X.C12920f2.LIZLLL(r6, r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L6c
            r1 = 1
        L6c:
            r0 = r1 ^ 1
            return r0
        L6f:
            r0 = 0
            goto L63
        L71:
            r0 = r4
            goto L47
        L73:
            r2 = 0
            goto L5a
        L75:
            r2 = r4
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42681lw.LJIIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect):boolean");
    }

    @Override // X.C0WF
    public final void LJIILJJIL(C0WD listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJFF).remove(listener);
    }

    @Override // X.C0WF
    public final void LJIIZILJ(C0WC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJI).remove(listener);
    }

    @Override // X.InterfaceC31981Ni
    public final void LJIJ(boolean z) {
        this.LJIIL = z;
    }

    @Override // X.C0WF
    public final void LJIJJ(C0WC listener) {
        o.LJIIIZ(listener, "listener");
        if (!((ArrayList) this.LJI).contains(listener)) {
            ((ArrayList) this.LJI).add(listener);
        }
    }

    @Override // X.C0WF
    public final void LJIJJLI(String str) {
        this.LIZIZ = str;
    }

    @Override // X.C0WF
    public final void LJJ(String str) {
        C08780Wc c08780Wc;
        C0WB c0wb;
        if (LiveEffectResolutionAdaptionSetting.INSTANCE.isEnabled() && (c08780Wc = this.LJ) != null && (c0wb = c08780Wc.LIZJ) != null) {
            c0wb.setRenderCacheString("LiveViewArea", str);
        }
    }

    @Override // X.InterfaceC31981Ni
    public final C12930f3 LJJII(LiveEffect liveEffect) {
        return LJJIJIIJI("liveguestbeauty", liveEffect, true, true, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // X.C0WF
    public final void LJJIIZ(C08780Wc c08780Wc) {
        List<String> list;
        java.util.Set set;
        Iterable iterable;
        Cursor cursor;
        ArrayList arrayList;
        List<String> list2;
        boolean z;
        this.LJ = c08780Wc;
        if (c08780Wc.LJI) {
            String str = c08780Wc.LJFF;
            if (str == null) {
                str = "broadcast";
            }
            java.util.Map<String, List<String>> map = C12870ex.LIZLLL;
            if (!map.containsKey(str)) {
                set = OQY.INSTANCE;
            } else {
                List<String> list3 = map.get(str);
                if (list3 == null) {
                    list3 = C61878OQg.INSTANCE;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<String> it = list3.iterator();
                while (it.hasNext()) {
                    String str2 = C12870ex.LJ.get(it.next());
                    if (str2 != null && (list = C12870ex.LIZJ.get(str2)) != null) {
                        linkedHashSet.addAll(list);
                    }
                }
                linkedHashSet.addAll(list3);
                set = linkedHashSet;
            }
            C08780Wc c08780Wc2 = this.LJ;
            if (c08780Wc2 == null || (iterable = c08780Wc2.LIZIZ) == null) {
                iterable = OQY.INSTANCE;
            }
            java.util.Set LJIIJJI = F5P.LJIIJJI(set, iterable);
            SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) this.LJIILIIL.getValue();
            sQLiteOpenHelper.getClass();
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase readableDatabase = sQLiteOpenHelper.getReadableDatabase();
            try {
                cursor = readableDatabase.query("live_composer_node", null, null, null, null, null, "update_time asc");
                while (cursor.moveToNext()) {
                    try {
                        String id = cursor.getString(cursor.getColumnIndex("id"));
                        C0WJ c0wj = InterfaceC31981Ni.LIZ;
                        String string = cursor.getString(cursor.getColumnIndex("panel"));
                        c0wj.getClass();
                        String LIZ = C0WJ.LIZ(str, string);
                        String effectId = cursor.getString(cursor.getColumnIndex("effect_id"));
                        String path = cursor.getString(cursor.getColumnIndex("path"));
                        long j = cursor.getLong(cursor.getColumnIndex("update_time"));
                        if (cursor.getInt(cursor.getColumnIndex("use")) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        o.LJIIIIZZ(effectId, "effectId");
                        o.LJIIIIZZ(path, "path");
                        C12930f3 c12930f3 = new C12930f3(j, LIZ, false, effectId, path);
                        c12930f3.LJII = z;
                        o.LJIIIIZZ(id, "id");
                        try {
                            C12910f1.LIZ(readableDatabase, id, c12930f3, arrayList2);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                C0NB.LJI("LiveComposerSQLiteHelper", th);
                            } finally {
                                if (cursor != null) {
                                    cursor.close();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            readableDatabase.close();
            if ((LiveBeautyReverseExperiment.INSTANCE.isInExperiment() || LiveEffectDowngradeSetting.INSTANCE.enable()) && o.LJ(str, "broadcast")) {
                arrayList = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C12930f3 c12930f32 = (C12930f3) next;
                    C08780Wc c08780Wc3 = this.LJ;
                    if (c08780Wc3 != null && (list2 = c08780Wc3.LIZIZ) != null && list2.contains(c12930f32.LIZ) && !o.LJ(c12930f32.LIZ, C0TY.LIZLLL)) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (LJIIJJI.contains(((C12930f3) next2).LIZ)) {
                        arrayList.add(next2);
                    }
                }
            }
            ArrayList arrayList3 = (ArrayList) this.LJIIIZ;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
        }
    }

    public final void LJJIJ(List<C12930f3> list) {
        C0WB c0wb;
        C0WB c0wb2;
        boolean z = false;
        String[] LJIIIZ = C12920f2.LJIIIZ(list, false);
        String[] LJI = C12920f2.LJI(LJIIIZ, this.LJIIJ);
        if (!list.isEmpty()) {
            Iterator<C12930f3> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (o.LJ(it.next().LJIIIIZZ, Boolean.TRUE)) {
                    z = true;
                    break;
                }
            }
        }
        LJJIZ(list);
        if (z) {
            C08780Wc c08780Wc = this.LJ;
            if (c08780Wc != null && (c0wb2 = c08780Wc.LIZJ) != null) {
                c0wb2.LJFF(LJIIIZ, LJI);
            }
        } else {
            C08780Wc c08780Wc2 = this.LJ;
            if (c08780Wc2 != null && (c0wb = c08780Wc2.LIZJ) != null) {
                c0wb.LJIIIZ(LJIIIZ, LJI);
            }
        }
        C0NB.LIZIZ("LiveComposerManagerB", "add composer node with extra: " + LJIIIZ);
    }

    public final void LJJIZ(List<C12930f3> list) {
        boolean z;
        Object obj;
        String str;
        List LJJLI = C32I.LJJLI(((HashMap) this.LJIIJ).values());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJJLI).iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((LiveEffect) next).quiz.length() > 0) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                LiveEffect liveEffect = (LiveEffect) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C12930f3> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (o.LJ(it3.next().LIZIZ, liveEffect.getResourceId())) {
                            break loop1;
                        }
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) obj;
        if (liveEffect2 == null) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (C12930f3 c12930f3 : list) {
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (o.LJ(((LiveEffect) it4.next()).getResourceId(), c12930f3.LIZIZ)) {
                        File file = new File(C78983UzD.LJJIIJZLJL(C0RY.LIZ(liveEffect2, "")));
                        if (!file.exists()) {
                            str = "";
                        } else {
                            str = C38485F8n.LLLFZ(file);
                        }
                        if (str.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            C12890ez.LIZ().setRenderCacheString("quiz", str);
                            return;
                        } else {
                            C12890ez.LIZ().setRenderCacheString("quiz", "");
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0190, code lost:
    
        r5.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c9, code lost:
    
        r2.add(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJJJJ(boolean r15) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42681lw.LJJJJ(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r9.add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList LJJIJIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r10, java.util.List r11) {
        /*
            java.util.ArrayList r6 = X.C61328O5c.LJ(r11)
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig> r0 = r10.composerConfigList
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r0.iterator()
        Lf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r7 = r8.next()
            r5 = r7
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r5 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect.ComposerConfig) r5
            java.util.Iterator r4 = r6.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.0f4 r2 = (X.C12940f4) r2
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = r5.tag
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L20
            java.lang.Float r0 = r2.LIZIZ
            if (r0 == 0) goto L20
            if (r3 != 0) goto Lf
        L3d:
            r9.add(r7)
            goto Lf
        L41:
            java.util.Iterator r4 = r9.iterator()
        L45:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r3 = r4.next()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r3 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect.ComposerConfig) r3
            java.util.Iterator r2 = r6.iterator()
            java.lang.String r0 = "result.iterator()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L5a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r2.next()
            X.0f4 r0 = (X.C12940f4) r0
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = r3.tag
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5a
            r2.remove()
            goto L5a
        L74:
            X.0f4 r2 = new X.0f4
            java.lang.String r0 = r3.tag
            r2.<init>(r0)
            int r0 = r3.LIZIZ
            float r0 = X.C12920f2.LIZJ(r3, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.LIZIZ = r0
            java.lang.String r1 = r10.getResourceId()
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.LIZJ = r1
            r6.add(r2)
            goto L45
        L96:
            java.util.ArrayList<java.lang.String> r0 = r10.updateKeys
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        La1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r3 = r4.next()
            java.util.Iterator r2 = r6.iterator()
        Laf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0f4 r0 = (X.C12940f4) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto Laf
            if (r1 != 0) goto La1
        Lc6:
            r5.add(r3)
            goto La1
        Lca:
            java.util.Iterator r2 = r5.iterator()
        Lce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le3
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0f4 r0 = new X.0f4
            r0.<init>(r1)
            r6.add(r0)
            goto Lce
        Le3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42681lw.LJJIJIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.util.List):java.util.ArrayList");
    }

    @Override // X.C0WF
    public final void LIZIZ(LiveEffect liveEffect, String panel) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(liveEffect, "liveEffect");
        if (!C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C73969T1h.LIZIZ().LIZIZ(new IDRunnableS0S1200000(liveEffect, panel, this, 12));
        } else {
            LJJIJIIJI(panel, liveEffect, true, true, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.InterfaceC31981Ni
    public final void LJ(int i, LiveEffect liveEffect) {
        Object obj;
        boolean z;
        Object obj2;
        List<C12940f4> list;
        Object obj3;
        if (this.LJ == null) {
            return;
        }
        LJJIL(liveEffect, "liveguestbeauty");
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C12930f3) obj).LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            z = false;
            LJJIJIIJIL(this, "liveguestbeauty", liveEffect, false, 16);
        } else {
            z = true;
        }
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (o.LJ(((C12930f3) obj2).LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C12930f3 c12930f3 = (C12930f3) obj2;
        if (c12930f3 != null) {
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.composerConfigList) {
                composerConfig.LIZ = i;
                Iterator it3 = ((ArrayList) c12930f3.LJI).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (o.LJ(composerConfig.tag, ((C12940f4) obj3).LIZ)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                C12940f4 c12940f4 = (C12940f4) obj3;
                if (c12940f4 != null) {
                    c12940f4.LIZIZ = Float.valueOf(C12920f2.LIZJ(composerConfig, i));
                }
            }
            c12930f3.LJ = System.currentTimeMillis();
        }
        if (z) {
            LJJJJ(true);
        }
        Iterator it4 = ((ArrayList) this.LJI).iterator();
        while (it4.hasNext()) {
            C0WC c0wc = (C0WC) it4.next();
            if (c12930f3 != null && (list = c12930f3.LJI) != null) {
                Iterator it5 = ((ArrayList) list).iterator();
                while (it5.hasNext()) {
                    Float f = ((C12940f4) it5.next()).LIZIZ;
                    if (f != null) {
                        f.floatValue();
                    }
                    c0wc.LIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC31981Ni
    public final Float LJFF(String effectId, String str) {
        Object obj;
        Object obj2;
        o.LJIIIZ(effectId, "effectId");
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C12930f3) obj).LIZIZ, effectId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C12930f3 c12930f3 = (C12930f3) obj;
        if (c12930f3 == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) c12930f3.LJI).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (o.LJ(((C12940f4) obj2).LIZ, str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C12940f4 c12940f4 = (C12940f4) obj2;
        if (c12940f4 == null) {
            return null;
        }
        return c12940f4.LIZIZ;
    }

    @Override // X.InterfaceC31981Ni
    public final void LJIILL(LiveEffect liveEffect, String panel) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(liveEffect, "liveEffect");
        LJJJI(liveEffect, panel, true);
    }

    @Override // X.InterfaceC31981Ni
    public final void LJIJI(String str, boolean z) {
        List arrayList;
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc == null || !c08780Wc.LJII) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            C12930f3 c12930f3 = (C12930f3) it.next();
            if (!arrayList2.contains(c12930f3.LIZ)) {
                arrayList2.add(c12930f3.LIZ);
            }
        }
        Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
        while (it2.hasNext()) {
            C12930f3 c12930f32 = (C12930f3) it2.next();
            if (!arrayList2.contains(c12930f32.LIZ)) {
                ((ArrayList) this.LJII).add(c12930f32);
            }
        }
        ((ArrayList) this.LJIIIZ).clear();
        List<C12930f3> list = this.LJIIIZ;
        List<C12930f3> list2 = this.LJII;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = ((ArrayList) list2).iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            C12930f3 c12930f33 = (C12930f3) next;
            C08780Wc c08780Wc2 = this.LJ;
            if (c08780Wc2 == null || (arrayList = c08780Wc2.LIZIZ) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.contains(c12930f33.LIZ)) {
                arrayList3.add(next);
            }
        }
        ((ArrayList) list).addAll(arrayList3);
        try {
            ((C12910f1) this.LJIILIIL.getValue()).LIZIZ(str, this.LJIIIZ);
        } catch (Exception e) {
            C0NB.LJFF("LiveComposerManagerB", e.getMessage(), e);
        }
        if (z) {
            return;
        }
        ((ArrayList) this.LJIIIZ).clear();
    }

    @Override // X.InterfaceC31981Ni
    public final void LJIL(String str, List<? extends LiveEffect> list) {
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc == null) {
            return;
        }
        List list2 = c08780Wc.LIZIZ;
        if (list2 == null) {
            list2 = new ArrayList();
        }
        if (!list2.contains(str) || ((ArrayList) this.LJIIIZ).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.LJIIIZ).iterator();
        while (it.hasNext()) {
            C12930f3 c12930f3 = (C12930f3) it.next();
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (o.LJ(c12930f3.LIZIZ, ((LiveEffect) next).getResourceId())) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            LJJJIL((LiveEffect) it3.next(), str);
        }
        List<C12930f3> list3 = this.LJIIIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = ((ArrayList) list3).iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (o.LJ(((C12930f3) next2).LIZ, str)) {
                arrayList2.add(next2);
            }
        }
        ((ArrayList) this.LJIIIZ).removeAll(arrayList2);
    }

    @Override // X.InterfaceC31981Ni
    public final int LJJIII(String nodePath, String nodeTag) {
        C0WB c0wb;
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(nodeTag, "nodeTag");
        int[] iArr = new int[1];
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
            c0wb.composerCheckNodeExclusion(nodePath, nodeTag, iArr);
        }
        return iArr[0];
    }

    public final void LJJIL(LiveEffect liveEffect, String str) {
        boolean z;
        C0WB c0wb;
        if (LiveEffectDowngradeSetting.INSTANCE.remove()) {
            if (o.LJ(str, "effect_gift")) {
                C08780Wc c08780Wc = this.LJ;
                if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
                    z = c0wb.LJII();
                } else {
                    z = false;
                }
                if (C29306Beo.LJIJI()) {
                    this.LJIILL.run();
                } else {
                    C15610jN.LIZ().post(this.LJIILL);
                }
                if (!z) {
                    C15610jN.LIZ().postDelayed(this.LJIILLIIL, 10000L);
                    return;
                }
                return;
            }
            if (!o.LJ(str, C0TY.LIZ())) {
                return;
            }
            if (C29306Beo.LJIJI()) {
                if (liveEffect.isNone()) {
                    this.LJIILLIIL.run();
                    return;
                } else {
                    this.LJIILL.run();
                    return;
                }
            }
            if (liveEffect.isNone()) {
                C15610jN.LIZ().post(this.LJIILLIIL);
            } else {
                C15610jN.LIZ().post(this.LJIILL);
            }
        }
    }

    public final void LJJJ(String str, boolean z) {
        String str2;
        C0WB c0wb;
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc == null) {
            return;
        }
        C0WB c0wb2 = c08780Wc.LIZJ;
        if (c0wb2 != null) {
            try {
                c0wb2.LJIIJJI(new String[0]);
                C08780Wc c08780Wc2 = this.LJ;
                if (c08780Wc2 != null && (c0wb = c08780Wc2.LIZJ) != null) {
                    c0wb.hide();
                }
            } catch (Throwable th) {
                C0NB.LJI("LiveComposerManagerB", th);
            }
        }
        if (this.LJIIL) {
            C08780Wc c08780Wc3 = this.LJ;
            if (c08780Wc3 != null && (str2 = c08780Wc3.LJFF) != null) {
                str = str2;
            }
            LJIJI(str, z);
        }
        ((ArrayList) this.LJII).clear();
        ((HashMap) this.LJIIJ).clear();
        ((CopyOnWriteArrayList) this.LJFF).clear();
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJIIIIZZ).clear();
        this.LJIIJJI.clear();
        this.LJ = null;
    }

    public final void LJJJIL(LiveEffect liveEffect, String str) {
        Object obj;
        float f;
        if (C78880UxY.LJJJJLI(liveEffect)) {
            List<? extends LiveEffect> list = liveEffect.subStickers;
            if (list != null) {
                Iterator<? extends LiveEffect> it = list.iterator();
                while (it.hasNext()) {
                    LJJJIL(it.next(), str);
                }
                return;
            }
            return;
        }
        Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                break;
            } else {
                obj = it2.next();
            }
        } while (!o.LJ(((C12930f3) obj).LIZIZ, liveEffect.getResourceId()));
        C12930f3 c12930f3 = (C12930f3) obj;
        if (c12930f3 != null) {
            Iterator it3 = ((ArrayList) c12930f3.LJI).iterator();
            while (it3.hasNext()) {
                liveEffect.updateKeys.add(((C12940f4) it3.next()).LIZ);
            }
            Iterator it4 = ((ArrayList) c12930f3.LJI).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (((C12940f4) next).LIZIZ != null) {
                    if (next != null) {
                        LJJIJIIJI(str, liveEffect, false, c12930f3.LJII, Long.valueOf(c12930f3.LJ));
                        List<C12940f4> list2 = c12930f3.LJI;
                        ArrayList arrayList = new ArrayList();
                        Iterator it5 = ((ArrayList) list2).iterator();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            if (((C12940f4) next2).LIZIZ != null) {
                                arrayList.add(next2);
                            }
                        }
                        Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            C12940f4 c12940f4 = (C12940f4) it6.next();
                            String str2 = c12940f4.LIZ;
                            Float f2 = c12940f4.LIZIZ;
                            if (f2 != null) {
                                f = f2.floatValue();
                            } else {
                                f = 0.0f;
                            }
                            LJJJJI(str, liveEffect, str2, f, Long.valueOf(c12930f3.LJ));
                        }
                        return;
                    }
                }
            }
            boolean z = c12930f3.LJII;
            LJJIJIIJI(str, liveEffect, z, z, Long.valueOf(c12930f3.LJ));
        }
    }

    @Override // X.C0WF
    public final void setRenderCacheString(String str, String value) {
        C0WB c0wb;
        o.LJIIIZ(value, "value");
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
            c0wb.setRenderCacheString(str, value);
        }
    }

    @Override // X.InterfaceC31981Ni
    public final void LJIIJJI(int i, LiveEffect liveEffect, String panel) {
        Object obj;
        boolean z;
        Object obj2;
        List<C12940f4> list;
        Object obj3;
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(liveEffect, "liveEffect");
        if (this.LJ == null) {
            return;
        }
        LJJIL(liveEffect, panel);
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C12930f3) obj).LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            z = false;
            LJJIJIIJIL(this, panel, liveEffect, false, 16);
        } else {
            z = true;
        }
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (o.LJ(((C12930f3) obj2).LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C12930f3 c12930f3 = (C12930f3) obj2;
        if (c12930f3 != null) {
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.composerConfigList) {
                if (composerConfig.LIZ != i) {
                    composerConfig.LIZ = i;
                    Iterator it3 = ((ArrayList) c12930f3.LJI).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (o.LJ(composerConfig.tag, ((C12940f4) obj3).LIZ)) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    C12940f4 c12940f4 = (C12940f4) obj3;
                    if (c12940f4 != null) {
                        float LIZJ = C12920f2.LIZJ(composerConfig, i);
                        if (!o.LIZJ(c12940f4.LIZIZ, LIZJ)) {
                            c12940f4.LIZIZ = Float.valueOf(LIZJ);
                        }
                    }
                }
            }
            c12930f3.LJ = System.currentTimeMillis();
        }
        if (z) {
            LJJJJ(true);
        }
        Iterator it4 = ((ArrayList) this.LJI).iterator();
        while (it4.hasNext()) {
            C0WC c0wc = (C0WC) it4.next();
            if (c12930f3 != null && (list = c12930f3.LJI) != null) {
                Iterator it5 = ((ArrayList) list).iterator();
                while (it5.hasNext()) {
                    Float f = ((C12940f4) it5.next()).LIZIZ;
                    if (f != null) {
                        f.floatValue();
                    }
                    c0wc.LIZ();
                }
            }
        }
    }

    @Override // X.C0WF
    public final void LJJIIJ(String panel, LiveEffect liveEffect, LiveEffect liveEffect2) {
        C12930f3 LJJJI;
        C0WB c0wb;
        C0WB c0wb2;
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(liveEffect2, "liveEffect");
        if (this.LJ == null) {
            return;
        }
        LJJIL(liveEffect2, panel);
        if (liveEffect == null) {
            LJJJI = null;
        } else {
            LJJJI = LJJJI(liveEffect, panel, false);
        }
        C12930f3 LJJIJIIJIL = LJJIJIIJIL(this, panel, liveEffect2, false, 24);
        LJJJJ(false);
        if (LJJIJIIJIL == null) {
            return;
        }
        String[] LJIIJ = C12920f2.LJIIJ(LJJIJIIJIL);
        String[] LJI = C12920f2.LJI(LJIIJ, this.LJIIJ);
        LJJIZ(C47261Igj.LJJIJ(LJJIJIIJIL));
        if (LJJJI != null) {
            String[] LJIIJ2 = C12920f2.LJIIJ(LJJJI);
            C08780Wc c08780Wc = this.LJ;
            if (c08780Wc != null && (c0wb2 = c08780Wc.LIZJ) != null) {
                c0wb2.LIZJ(LJIIJ2, LJIIJ, LJI);
                return;
            }
            return;
        }
        C08780Wc c08780Wc2 = this.LJ;
        if (c08780Wc2 == null || (c0wb = c08780Wc2.LIZJ) == null) {
            return;
        }
        c0wb.LJIIIZ(LJIIJ, LJI);
    }

    public final C12930f3 LJJJI(LiveEffect liveEffect, String str, boolean z) {
        C12930f3 c12930f3;
        List arrayList;
        if (this.LJ == null) {
            return null;
        }
        Iterator<C12930f3> it = this.LJII.iterator();
        while (true) {
            if (it.hasNext()) {
                c12930f3 = it.next();
                if (o.LJ(c12930f3.LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                c12930f3 = null;
                break;
            }
        }
        C12930f3 c12930f32 = c12930f3;
        if (c12930f32 == null) {
            return null;
        }
        ((ArrayList) this.LJII).remove(c12930f32);
        C08780Wc c08780Wc = this.LJ;
        if (c08780Wc == null || (arrayList = c08780Wc.LJ) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(c12930f32.LIZ)) {
            c12930f32.LJII = false;
            ((ArrayList) this.LJII).add(c12930f32);
        }
        if (z) {
            LJJJJ(true);
        }
        Iterator<C0WD> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().Z00(liveEffect, str, false);
        }
        return c12930f32;
    }

    public static /* synthetic */ C12930f3 LJJIJIIJIL(C42681lw c42681lw, String str, LiveEffect liveEffect, boolean z, int i) {
        boolean z2 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c42681lw.LJJIJIIJI(str, liveEffect, false, z2, null);
    }

    public final C12930f3 LJJIJIIJI(String str, LiveEffect liveEffect, boolean z, boolean z2, Long l) {
        Boolean bool;
        List<String> list;
        C08780Wc c08780Wc;
        List<C0WA> list2;
        Object obj;
        long currentTimeMillis;
        LiveEffect.AudioGraphBean audioGraphBean;
        long currentTimeMillis2;
        Boolean bool2 = null;
        if (this.LJ == null) {
            return null;
        }
        LJJIL(liveEffect, str);
        if (this.LJ != null) {
            if (liveEffect.coexistGroup.isEmpty() && (c08780Wc = this.LJ) != null && (list2 = c08780Wc.LIZ) != null) {
                ArrayList arrayList = new ArrayList();
                for (C0WA c0wa : list2) {
                    if (o.LJ(c0wa.LIZIZ, str)) {
                        arrayList.add(c0wa);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    liveEffect.coexistGroup.addAll(((C0WA) it.next()).LIZ);
                }
            }
            if (liveEffect.isWithoutFace == null) {
                C08780Wc c08780Wc2 = this.LJ;
                if (c08780Wc2 != null && (list = c08780Wc2.LIZLLL) != null) {
                    bool = Boolean.valueOf(list.contains(str));
                } else {
                    bool = Boolean.FALSE;
                }
                liveEffect.isWithoutFace = bool;
            }
            if (!((HashMap) this.LJIIJ).containsKey(str)) {
                ((HashMap) this.LJIIJ).put(str, new ArrayList());
            }
            List list3 = (List) ((HashMap) this.LJIIJ).get(str);
            if (list3 != null) {
                list3.remove(liveEffect);
                list3.add(liveEffect);
            }
        }
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (o.LJ(((C12930f3) obj).LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C12930f3 c12930f3 = (C12930f3) obj;
        if (c12930f3 != null) {
            if (c12930f3.LJII == z2 && l == null) {
                return c12930f3;
            }
            ((ArrayList) this.LJII).remove(c12930f3);
            ArrayList LJJIJIL = LJJIJIL(liveEffect, c12930f3.LJI);
            ((ArrayList) c12930f3.LJI).clear();
            ((ArrayList) c12930f3.LJI).addAll(LJJIJIL);
            if (l != null) {
                currentTimeMillis2 = l.longValue();
            } else {
                currentTimeMillis2 = System.currentTimeMillis();
            }
            c12930f3.LJ = currentTimeMillis2;
            c12930f3.LJII = z2;
            ((ArrayList) this.LJII).add(c12930f3);
        } else {
            String resourceId = liveEffect.getResourceId();
            String str2 = liveEffect.unzipPath;
            Boolean bool3 = liveEffect.isWithoutFace;
            o.LJI(bool3);
            boolean booleanValue = bool3.booleanValue();
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            c12930f3 = new C12930f3(currentTimeMillis, str, booleanValue, resourceId, str2);
            c12930f3.LJIIIZ = liveEffect.effectPanelKey;
            c12930f3.LJII = z2;
            LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
            if (stickerSDKExtra != null && (audioGraphBean = stickerSDKExtra.audioGraph) != null) {
                bool2 = audioGraphBean.getUseOutput();
            }
            c12930f3.LJIIIIZZ = bool2;
            ((ArrayList) c12930f3.LJFF).addAll(liveEffect.coexistGroup);
            ArrayList LJJIJIL2 = LJJIJIL(liveEffect, c12930f3.LJI);
            ((ArrayList) c12930f3.LJI).clear();
            ((ArrayList) c12930f3.LJI).addAll(LJJIJIL2);
            ((ArrayList) this.LJII).add(c12930f3);
        }
        if (z) {
            LJJJJ(true);
        }
        Iterator it3 = ((CopyOnWriteArrayList) this.LJFF).iterator();
        while (it3.hasNext()) {
            ((C0WD) it3.next()).Z00(liveEffect, str, true);
        }
        return c12930f3;
    }

    public final void LJJJJI(String str, LiveEffect liveEffect, String tag, float f, Long l) {
        Object obj;
        Object obj2;
        boolean z;
        long currentTimeMillis;
        o.LJIIIZ(liveEffect, "liveEffect");
        o.LJIIIZ(tag, "tag");
        if (this.LJ == null) {
            return;
        }
        LJJIL(liveEffect, str);
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (o.LJ(((C12930f3) obj2).LIZIZ, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        if (obj2 == null) {
            z = false;
            LJJIJIIJIL(this, str, liveEffect, false, 16);
        } else {
            z = true;
        }
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (o.LJ(((C12930f3) next).LIZIZ, liveEffect.getResourceId())) {
                obj = next;
                break;
            }
        }
        C12930f3 c12930f3 = (C12930f3) obj;
        if (c12930f3 != null) {
            Iterator it3 = ((ArrayList) c12930f3.LJI).iterator();
            while (it3.hasNext()) {
                C12940f4 c12940f4 = (C12940f4) it3.next();
                if (!o.LIZJ(c12940f4.LIZIZ, f) || l != null) {
                    c12940f4.LIZIZ = Float.valueOf(f);
                }
            }
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.composerConfigList) {
                int LIZ = C12920f2.LIZ(composerConfig, f);
                if (composerConfig.LIZ != LIZ || l != null) {
                    composerConfig.LIZ = LIZ;
                }
            }
            if (l != null) {
                currentTimeMillis = l.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            c12930f3.LJ = currentTimeMillis;
        }
        if (z) {
            LJJJJ(true);
        }
        Iterator it4 = ((ArrayList) this.LJI).iterator();
        while (it4.hasNext()) {
            ((C0WC) it4.next()).LIZ();
        }
    }
}
