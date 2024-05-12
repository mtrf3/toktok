package com.ss.android.ugc.aweme.mention.viewmodel;

import X.C217798gh;
import X.C217918gt;
import X.C221108m2;
import X.C32I;
import X.C62822Ol8;
import X.Y9G;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public final class MentionStickerSearchViewModel extends ViewModel {
    public C217798gh LJLIL;
    public String LJLILLLLZI = "";
    public final Set<String> LJLJI = new LinkedHashSet();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 489));
    public final Set<String> LJLJJL = new LinkedHashSet();

    public final List<C217918gt> gv0(List<Y9G> list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Y9G> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C217918gt(it.next()));
        }
        return arrayList;
    }
}
