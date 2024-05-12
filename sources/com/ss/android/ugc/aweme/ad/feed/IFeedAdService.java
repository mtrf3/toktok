package com.ss.android.ugc.aweme.ad.feed;

import X.AnonymousClass813;
import X.C214018ab;
import X.C214038ad;
import X.C58653N0f;
import X.C59058NFu;
import X.C59059NFv;
import X.C59060NFw;
import X.C59096NHg;
import X.C59105NHp;
import X.C59192NKy;
import X.C59211NLr;
import X.C59320NPw;
import X.C59775Nd5;
import X.C93833mF;
import X.IDY;
import X.InterfaceC48720JAe;
import X.InterfaceC58172Qb;
import X.InterfaceC59191NKx;
import X.InterfaceC59245NMz;
import X.NI8;
import X.NL3;
import X.NL7;
import X.NLI;
import X.NLP;
import X.NLY;
import X.NQ4;
import X.NQC;
import X.ViewOnClickListenerC59350NRa;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* loaded from: classes11.dex */
public interface IFeedAdService {
    TuxActionSheet LIZ(Context context, Aweme aweme, String str);

    ViewOnClickListenerC59350NRa LIZIZ(C214018ab c214018ab);

    void LIZJ();

    C59211NLr LIZLLL(View view);

    C59060NFw LJ();

    C59192NKy LJFF(ViewStub viewStub);

    InterfaceC59245NMz LJI();

    NL7 LJII(ViewStub viewStub);

    IDY LJIIIIZZ();

    void LJIIIZ();

    NL3 LJIIJ(ViewStub viewStub);

    void LJIIJJI();

    NLP LJIIL(ViewStub viewStub, FrameLayout frameLayout);

    List<InterfaceC48720JAe> LJIILIIL();

    void LJIILJJIL();

    boolean LJIILL(Aweme aweme);

    void LJIILLIIL();

    void LJIIZILJ();

    void LJIJ();

    C59775Nd5 LJIJI(ViewGroup viewGroup);

    void LJIJJ(InterfaceC59191NKx interfaceC59191NKx);

    C59096NHg LJIJJLI(AnonymousClass813 anonymousClass813);

    List<InterfaceC58172Qb> LJIL();

    NLI LJJ(ViewStub viewStub);

    void LJJI(Aweme aweme, C58653N0f c58653N0f, String str);

    NI8 LJJIFFI(View view, VideoBaseCell videoBaseCell, String str);

    NQ4 LJJII(C214038ad c214038ad);

    void LJJIII();

    C59105NHp LJJIIJ(ViewStub viewStub);

    void LJJIIJZLJL();

    void LJJIIZ(Bundle bundle);

    C59320NPw LJJIIZI(NQC nqc);

    NLY LJJIJ(ViewStub viewStub);

    C59059NFv LJJIJIIJI();

    void LJJIJIIJIL(String str, AwemeRawAd awemeRawAd, C93833mF c93833mF);

    Bundle LJJIJIL();

    C59058NFu LJJIJL();

    String getEnterFrom();

    void setEnterFrom(String str);
}
