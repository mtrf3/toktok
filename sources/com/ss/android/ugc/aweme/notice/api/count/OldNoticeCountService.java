package com.ss.android.ugc.aweme.notice.api.count;

import X.AbstractC73672Svk;
import X.EnumC54302LSw;
import X.LVG;
import android.os.Message;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface OldNoticeCountService {
    AbstractC73672Svk LIZ(NoticeList noticeList);

    void LIZIZ(int i, boolean z);

    void LIZJ(boolean z);

    int LIZLLL();

    int LJ(int i);

    int LJFF();

    int LJI(int i);

    void LJII(Message message);

    void LJIIIIZZ(int i, int i2);

    void LJIIIZ();

    NoticeGroupAttrs LJIIJ(int i);

    int LJIIJJI(int i);

    void LJIIL(LVG lvg, int[] iArr);

    int LJIILIIL(String str);

    void LJIILJJIL(LVG lvg, int[] iArr);

    Map<Integer, Integer> LJIILL();

    void LJIILLIIL();

    void LJIIZILJ(String str, List list);

    int LJIJ();

    List LJIJI(int i);

    int LJIJJ();

    int LJIJJLI(int i, EnumC54302LSw enumC54302LSw);
}
