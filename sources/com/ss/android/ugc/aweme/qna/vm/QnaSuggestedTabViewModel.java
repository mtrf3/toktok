package com.ss.android.ugc.aweme.qna.vm;

import X.AV1;
import X.C32I;
import X.C61878OQg;
import X.C69606RTm;
import X.C74099T6h;
import X.C74100T6i;
import X.MI9;
import X.MIA;
import X.MIB;
import X.MIL;
import X.OSZ;
import X.T7D;
import X.T7E;
import X.T7O;
import X.T8T;
import X.XKX;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaSuggestedTabViewModel extends QnaViewModel implements T8T {
    public final T7O LJLJL;
    public MIL LJLJLJ;
    public boolean LJLJLLL = true;
    public final MutableLiveData LJLL;
    public final LiveData<C74100T6i<Boolean>> LJLLI;
    public final MutableLiveData LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public final MutableLiveData<C74100T6i<C69606RTm>> LJLLL;
    public final MutableLiveData<C74100T6i<String>> LJLLLL;
    public final MutableLiveData LJLLLLLL;
    public final MutableLiveData LJLZ;
    public final MutableLiveData<C74100T6i<OSZ<QaStruct, Boolean>>> LJZ;
    public final MutableLiveData LJZI;
    public final MutableLiveData<C74100T6i<Integer>> LJZL;
    public final MutableLiveData LL;

    @Override // X.T84
    public final void q00(T7E t7e) {
    }

    @Override // X.T8T
    public final void Qi0() {
        this.LJZL.setValue(new C74100T6i<>(0));
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.QnaViewModel, X.T84
    public final void LLLL() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new MIA(this, null), 3);
    }

    public QnaSuggestedTabViewModel(T7O t7o) {
        this.LJLJL = t7o;
        MutableLiveData mutableLiveData = t7o.LJIIJ;
        this.LJLL = mutableLiveData;
        LiveData<C74100T6i<Boolean>> map = Transformations.map(mutableLiveData, new C74099T6h(this));
        o.LJIIIIZZ(map, "map(suggestedQnaCellMuta…nt(false)\n        }\n    }");
        this.LJLLI = map;
        this.LJLLILLLL = t7o.LJIILJJIL;
        this.LJLLJ = t7o.LJIJ;
        this.LJLLL = t7o.LJIIL;
        this.LJLLLL = t7o.LJIILLIIL;
        this.LJLLLLLL = t7o.LJIJI;
        this.LJLZ = new MutableLiveData();
        MutableLiveData<C74100T6i<OSZ<QaStruct, Boolean>>> mutableLiveData2 = new MutableLiveData<>();
        this.LJZ = mutableLiveData2;
        this.LJZI = mutableLiveData2;
        MutableLiveData<C74100T6i<Integer>> mutableLiveData3 = new MutableLiveData<>();
        this.LJZL = mutableLiveData3;
        this.LL = mutableLiveData3;
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.QnaViewModel, X.T84
    public final void RO(String questionId) {
        o.LJIIIZ(questionId, "questionId");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new MIB(this, questionId, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.QnaViewModel, X.T84
    public final void jI(int i, String str) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new MI9(this, str, i, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.qna.vm.QnaViewModel, X.T84
    public final void HO(String str, List list, boolean z) {
        String str2;
        User creator;
        ?? r15;
        T7O t7o = this.LJLJL;
        t7o.getClass();
        T7D t7d = t7o.LIZ;
        t7d.getClass();
        ForumStruct forumStruct = (ForumStruct) ((LinkedHashMap) t7d.LIZIZ).get(Long.valueOf(CastLongProtector.parseLong(str)));
        if (forumStruct == null || (str2 = forumStruct.getContent()) == null) {
            str2 = "";
        }
        T7O t7o2 = this.LJLJL;
        t7o2.getClass();
        T7D t7d2 = t7o2.LIZ;
        t7d2.getClass();
        ForumStruct forumStruct2 = (ForumStruct) ((LinkedHashMap) t7d2.LIZIZ).get(Long.valueOf(CastLongProtector.parseLong(str)));
        if (forumStruct2 != null && (creator = forumStruct2.getCreator()) != null) {
            String creatorId = creator.getUid();
            String LJI = AV1.LJI(creator);
            String secUid = creator.getSecUid();
            long parseLong = CastLongProtector.parseLong(str);
            o.LJIIIIZZ(creatorId, "creatorId");
            long parseLong2 = CastLongProtector.parseLong(creatorId);
            UrlModel avatarThumb = creator.getAvatarThumb();
            if (list != null) {
                r15 = new ArrayList(C32I.LJJL(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r15.add(Long.valueOf(CastLongProtector.parseLong((String) it.next())));
                }
            } else {
                r15 = C61878OQg.INSTANCE;
            }
            this.LJZ.setValue(new C74100T6i<>(new OSZ(new QaStruct(parseLong, parseLong2, 0L, avatarThumb, LJI, str2, secUid, r15, null, null, null, null, null, null, 0, null, null, 130820, null), Boolean.valueOf(z))));
        }
    }
}
