package com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric;

import X.C73543Stf;
import X.C91065Zob;
import X.C91075Zol;
import X.C91077Zon;
import X.C91084Zou;
import X.C91316Zse;
import X.C91319Zsh;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.dsp.common.arch.BaseMusicDspViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class BaseLyricsViewModel extends BaseMusicDspViewModel {
    public C73543Stf LJLJI;
    public C91084Zou LJLILLLLZI = new C91084Zou();
    public final MutableLiveData<C91075Zol> LJLJJI = new MutableLiveData<>();

    public C91084Zou iv0() {
        return this.LJLILLLLZI;
    }

    public final ArrayList<C91077Zon> gv0(C91316Zse c91316Zse) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c91316Zse.LIZJ.size() <= 0) {
            return null;
        }
        ArrayList<C91319Zsh> arrayList = c91316Zse.LIZJ;
        ArrayList<C91077Zon> arrayList2 = new ArrayList<>();
        Iterator<C91319Zsh> it = arrayList.iterator();
        while (it.hasNext()) {
            C91319Zsh next = it.next();
            C91077Zon c91077Zon = new C91077Zon(3, next);
            c91077Zon.LIZJ = C91065Zob.LIZ(iv0(), next.LIZ);
            arrayList2.add(c91077Zon);
        }
        C91077Zon c91077Zon2 = new C91077Zon(1, 2);
        c91077Zon2.LIZJ = iv0().LJIIJJI;
        ListProtector.add(arrayList2, 0, c91077Zon2);
        C91077Zon c91077Zon3 = new C91077Zon(2, 2);
        c91077Zon3.LIZJ = iv0().LJIIL;
        arrayList2.add(c91077Zon3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("convert lyrics view info cost : ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        X1D.LIZIZ(LIZ);
        return arrayList2;
    }

    public void jv0(C91084Zou c91084Zou) {
        o.LJIIIZ(c91084Zou, "<set-?>");
        this.LJLILLLLZI = c91084Zou;
    }

    public final void hv0(C91075Zol c91075Zol, Music music) {
        String str;
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("do result  ->  the lyrics info, musicID is: ");
        LIZ.append(c91075Zol.LIZIZ);
        LIZ.append(",  Lyric_url is: ");
        Integer num = null;
        if (music != null) {
            str = music.getLrcUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",  Lyric_type is: ");
        if (music != null) {
            num = Integer.valueOf(music.getLrcType());
        }
        LIZ.append(num);
        LIZ.append(",  itemViewInfoList size is: ");
        ArrayList<C91077Zon> arrayList = c91075Zol.LIZ;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        this.LJLJJI.postValue(c91075Zol);
    }
}
