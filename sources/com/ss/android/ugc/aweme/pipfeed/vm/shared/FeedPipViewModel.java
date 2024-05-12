package com.ss.android.ugc.aweme.pipfeed.vm.shared;

import X.C32I;
import X.C48770JCc;
import X.C48780JCm;
import X.C61878OQg;
import X.EnumC48781JCn;
import X.INR;
import X.INS;
import X.INT;
import X.JCP;
import X.JCS;
import X.M89;
import X.ORS;
import Y.AObserverS76S0100000_8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeedPipViewModel extends ViewModel {
    public static final List<INT> LL = new ArrayList();
    public final FeedPipViewModel$currentAweme$1 LJLIL;
    public Aweme LJLILLLLZI;
    public final AObserverS76S0100000_8 LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public M89 LJLJJLL;
    public C48780JCm LJLJL;
    public JCS LJLJLJ;
    public final List<Aweme> LJLJLLL;
    public final Set<String> LJLL;
    public final MutableLiveData<List<Aweme>> LJLLI;
    public boolean LJLLILLLL;
    public final MutableLiveData<Boolean> LJLLJ;
    public final MutableLiveData<Boolean> LJLLL;
    public final MutableLiveData<EnumC48781JCn> LJLLLL;
    public Aweme LJLLLLLL;
    public int LJLZ;
    public final Set<String> LJZ;
    public final JCP LJZI;
    public boolean LJZL;

    public final List<Aweme> hv0() {
        List<Aweme> list = this.LJLJLLL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (INR.LIZ((Aweme) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1] */
    public FeedPipViewModel() {
        INT r4 = new INT("force_skip_list", INS.BLOCK, new AqS174S0100000_8(this, 50));
        String key = r4.LIZ;
        o.LJIIIZ(key, "key");
        List<INT> list = LL;
        ORS.LJJLIL(new AqS31S1000000_8(key, 0), list);
        ((ArrayList) list).add(r4);
        this.LJLIL = new MutableLiveData<Aweme>() { // from class: com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1
            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void postValue(Aweme aweme) {
                String str;
                if (aweme != null) {
                    FeedPipViewModel feedPipViewModel = FeedPipViewModel.this;
                    if (!INR.LIZ(aweme)) {
                        Aweme gv0 = feedPipViewModel.gv0(aweme);
                        if (gv0 != null) {
                            feedPipViewModel.LJZI.LIZJ = false;
                            postValue(gv0);
                            return;
                        }
                        return;
                    }
                }
                Aweme value = getValue();
                String str2 = null;
                if (value != null) {
                    str = value.getAid();
                } else {
                    str = null;
                }
                if (aweme != null) {
                    str2 = aweme.getAid();
                }
                if (!o.LJ(str, str2)) {
                    FeedPipViewModel.this.LJZI.LIZIZ = 0.0f;
                }
                super.postValue((FeedPipViewModel$currentAweme$1) aweme);
            }

            @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
            public void setValue(Aweme aweme) {
                String str;
                if (aweme != null) {
                    FeedPipViewModel feedPipViewModel = FeedPipViewModel.this;
                    if (!INR.LIZ(aweme)) {
                        Aweme gv0 = feedPipViewModel.gv0(aweme);
                        if (gv0 != null) {
                            feedPipViewModel.LJZI.LIZJ = false;
                            setValue(gv0);
                            return;
                        }
                        return;
                    }
                }
                Aweme value = getValue();
                String str2 = null;
                if (value != null) {
                    str = value.getAid();
                } else {
                    str = null;
                }
                if (aweme != null) {
                    str2 = aweme.getAid();
                }
                if (!o.LJ(str, str2)) {
                    FeedPipViewModel.this.LJZI.LIZIZ = 0.0f;
                }
                super.setValue((FeedPipViewModel$currentAweme$1) aweme);
            }
        };
        this.LJLJI = new AObserverS76S0100000_8(this, 22);
        this.LJLJL = new C48780JCm(0);
        this.LJLJLLL = new ArrayList();
        this.LJLL = new LinkedHashSet();
        this.LJLLI = new MutableLiveData<>(C61878OQg.INSTANCE);
        this.LJLLILLLL = true;
        this.LJLLJ = new MutableLiveData<>(Boolean.TRUE);
        this.LJLLL = new MutableLiveData<>(Boolean.FALSE);
        this.LJLLLL = new MutableLiveData<>(EnumC48781JCn.SUCCEED);
        this.LJZ = new LinkedHashSet();
        this.LJZI = new JCP(0);
    }

    public final Aweme gv0(Aweme aweme) {
        boolean z;
        Integer valueOf = Integer.valueOf(((ArrayList) this.LJLJLLL).indexOf(aweme));
        if (valueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ListIterator listIterator = ((ArrayList) this.LJLJLLL).listIterator(valueOf.intValue());
            while (listIterator.hasNext()) {
                Aweme aweme2 = (Aweme) listIterator.next();
                if (INR.LIZ(aweme2)) {
                    return aweme2;
                }
            }
        }
        return null;
    }

    public final boolean iv0(Aweme aweme) {
        String str;
        o.LJIIIZ(aweme, "aweme");
        Aweme aweme2 = this.LJLLLLLL;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str, aweme.getAid()) && this.LJZL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jv0(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L20
            java.lang.String r1 = r4.getAid()
            com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1 r0 = r3.LJLIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getAid()
        L15:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L20
        L1b:
            r3.LJLLLLLL = r4
            return
        L1e:
            r0 = r2
            goto L15
        L20:
            r4 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel.jv0(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void kv0(int i) {
        if (i < 0 || i >= ((ArrayList) hv0()).size()) {
            return;
        }
        if (((ArrayList) this.LJLJLLL).isEmpty() || ((ArrayList) hv0()).isEmpty()) {
            this.LJLZ = 0;
            this.LJZI.LIZ = 0;
            return;
        }
        int indexOf = ((ArrayList) this.LJLJLLL).indexOf(ListProtector.get(hv0(), i));
        JCP jcp = this.LJZI;
        jcp.LIZ = indexOf;
        if (indexOf < 0) {
            jcp.LIZ = 0;
        }
        this.LJLZ = i;
    }

    public final void lv0(List<? extends Aweme> list) {
        o.LJIIIZ(list, "list");
        if (((Boolean) C48770JCc.LIZ.getValue()).booleanValue()) {
            this.LJLL.clear();
            Set<String> set = this.LJLL;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<? extends Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAid());
            }
            set.addAll(arrayList);
        }
    }
}
