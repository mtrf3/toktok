package com.ss.android.ugc.aweme.mix.pickcandidate;

import X.C221108m2;
import X.C228648yC;
import X.C62822Ol8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import ujb.o;

/* loaded from: classes4.dex */
public final class MultiVideoViewModel extends ViewModel {
    public boolean LJLJL;
    public final List<Aweme> LJLIL = new ArrayList();
    public final List<C228648yC> LJLILLLLZI = new ArrayList();
    public final List<Aweme> LJLJI = new ArrayList();
    public final MutableLiveData<Integer> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJJL = new MutableLiveData<>();
    public boolean LJLJJLL = true;
    public final MutableLiveData<Integer> LJLJLJ = new MutableLiveData<>();
    public List<String> LJLJLLL = new ArrayList();
    public String LJLL = "";
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 528));

    public final List<C228648yC> gv0(List<? extends Aweme> list) {
        UrlModel urlModel;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                C228648yC c228648yC = new C228648yC(0);
                Video video = aweme.getVideo();
                if (video != null) {
                    urlModel = video.getCover();
                } else {
                    urlModel = null;
                }
                c228648yC.LJLIL = urlModel;
                boolean z = aweme.playlistBlocked;
                c228648yC.LJLJI = z;
                c228648yC.LJLJL = z;
                PlayListInfo playListInfo = aweme.playlist_info;
                if (playListInfo != null) {
                    if (o.LJJJJIZL(playListInfo.getMixId(), this.LJLL, false)) {
                        c228648yC.LJLJJLL = true;
                        c228648yC.LJLILLLLZI = true;
                    } else {
                        c228648yC.LJLJJI = true;
                        c228648yC.LJLJI = true;
                    }
                }
                c228648yC.LJLJJL = aweme;
                Iterator it = ((ArrayList) this.LJLJI).iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.LJ(aweme, it.next())) {
                        c228648yC.LJLILLLLZI = true;
                        c228648yC.LJLJJLL = true;
                    }
                }
                Iterator<String> it2 = this.LJLJLLL.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.o.LJ(aweme.getAid(), it2.next())) {
                        c228648yC.LJLJJI = false;
                        c228648yC.LJLJI = false;
                        c228648yC.LJLJJLL = false;
                        c228648yC.LJLILLLLZI = false;
                    }
                }
                arrayList.add(c228648yC);
            }
        }
        return arrayList;
    }

    public final void hv0(Aweme aweme) {
        if (aweme != null) {
            ((ArrayList) this.LJLJI).remove(aweme);
            this.LJLJJI.postValue(Integer.valueOf(((ArrayList) this.LJLJI).size()));
            if (this.LJLJLJ.getValue() != null) {
                kotlin.jvm.internal.o.LJI(this.LJLJLJ.getValue());
                this.LJLJLJ.postValue(Integer.valueOf(r0.intValue() - 1));
            }
        }
    }

    public final void iv0(Aweme aweme) {
        if (aweme != null) {
            ((ArrayList) this.LJLJI).add(aweme);
            this.LJLJJI.postValue(Integer.valueOf(((ArrayList) this.LJLJI).size()));
            if (this.LJLJLJ.getValue() != null) {
                Integer value = this.LJLJLJ.getValue();
                kotlin.jvm.internal.o.LJI(value);
                this.LJLJLJ.postValue(Integer.valueOf(value.intValue() + 1));
            }
        }
    }
}
