package com.ss.android.ugc.aweme.notice.api.services;

import X.AbstractC73672Svk;
import X.EnumC54302LSw;
import X.LVG;
import android.os.Message;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface INoticeCountService {
    AbstractC73672Svk LIZ(NoticeList noticeList);

    void LIZIZ(int i, int i2);

    int LIZJ(int i, EnumC54302LSw enumC54302LSw);

    int LIZLLL();

    Map<Integer, Integer> LJ();

    int LJFF();

    void LJI(Message message);

    void LJII(String str, List list);

    int LJIIIIZZ(int i, EnumC54302LSw enumC54302LSw, boolean z);

    void LJIIIZ(int i, LVG lvg, boolean z);

    NoticeGroupAttrs LJIIJ(int i);

    void LJIIJJI(LVG lvg, boolean z, int[] iArr);

    int LJIILIIL(String str);

    void LJIILJJIL();

    boolean LJIILL(LVG lvg, boolean z, int[] iArr);

    void LJIILLIIL(int i, boolean z);

    int LJIIZILJ(boolean z, int[] iArr);

    int LJIJ();

    int LJIJI();

    int LJIJJ(int i);

    void LJIL(LVG lvg, int[] iArr);
}
