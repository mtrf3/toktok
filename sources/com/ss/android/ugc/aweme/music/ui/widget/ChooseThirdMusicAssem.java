package com.ss.android.ugc.aweme.music.ui.widget;

import X.ASQ;
import X.ASX;
import X.C212428Vi;
import X.C44140HUa;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C63058Oow;
import X.FMX;
import X.InterfaceC63059Oox;
import X.OX0;
import X.SUC;
import X.SUD;
import X.SUI;
import X.SVB;
import X.SYL;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChooseThirdMusicAssem extends UIContentAssem implements InterfaceC63059Oox {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, SUC.class, "music_info"), checkSupervisorPrepared());
    public Fragment LJLILLLLZI;
    public SUD LJLJI;

    @Override // X.InterfaceC63059Oox, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final SUC x3() {
        return (SUC) this.LJLIL.getValue();
    }

    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public SUI defaultObservableData() {
        return new SUI();
    }

    @Override // X.InterfaceC63059Oox
    public void ll(ExternalMusicInfo musicInfo) {
        boolean z;
        o.LJIIIZ(musicInfo, "musicInfo");
        Fragment fragment = this.LJLILLLLZI;
        if (fragment != null) {
            ASQ.LJ(fragment, ASX.LIZ);
            Fragment fragment2 = this.LJLILLLLZI;
            if (fragment2 != null) {
                Fragment parentFragment = fragment2.getParentFragment();
                if (parentFragment == null || parentFragment.getFragmentManager() == null) {
                    return;
                }
                OX0 ox0 = x3().LJLJLLL;
                if (ox0 != null) {
                    z = ox0.getDisableCollect();
                } else {
                    z = false;
                }
                Map LIZIZ = C44140HUa.LIZIZ(x3().LJLJJL, x3().LJLJI, z);
                SUD sud = this.LJLJI;
                if (sud != null) {
                    Fragment fragment3 = this.LJLILLLLZI;
                    if (fragment3 != null) {
                        Context context = fragment3.getContext();
                        x3();
                        sud.LIZ(context, musicInfo, true, x3().LJLJJI, x3().LJLJL, x3().LJLJLLL, LIZIZ);
                        return;
                    }
                    o.LJIJI("fragment");
                    throw null;
                }
                o.LJIJI("thirdMusicLogic");
                throw null;
            }
            o.LJIJI("fragment");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        o.LJIIIZ(view, "view");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            return;
        }
        this.LJLILLLLZI = LIZLLL;
        Fragment fragment = this.LJLILLLLZI;
        if (fragment != null) {
            fragment.getContext();
            x3();
            this.LJLJI = new SUD(x3().LJLJI, x3().LJLJJI, x3().LJLJJL, x3().LJLJLJ);
            SYL syl = (SYL) view;
            Fragment fragment2 = this.LJLILLLLZI;
            if (fragment2 != null) {
                fragment2.getContext();
                syl.setLayoutManager(new LinearLayoutManager());
                syl.LLLF.LJZL(ThirdMusicViewHolder.class);
                syl.setLifecycleOwner(this);
                ArrayList arrayList = new ArrayList();
                int size = x3().LJLIL.size();
                int i = 0;
                for (ExternalMusicInfo externalMusicInfo : x3().LJLIL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ExternalMusicInfo externalMusicInfo2 = externalMusicInfo;
                        if (i == size - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new C63058Oow(externalMusicInfo2, z));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                syl.getState().LJIILLIIL(arrayList);
                return;
            }
            o.LJIJI("fragment");
            throw null;
        }
        o.LJIJI("fragment");
        throw null;
    }

    @Override // X.InterfaceC63059Oox
    public void y3(ExternalMusicInfo musicInfo) {
        String str;
        String str2;
        Map<String, String> map;
        String str3;
        o.LJIIIZ(musicInfo, "musicInfo");
        SUD sud = this.LJLJI;
        if (sud != null) {
            Fragment fragment = this.LJLILLLLZI;
            if (fragment != null) {
                Context context = fragment.getContext();
                List<ExternalMusicInfo> LJJIJ = C47261Igj.LJJIJ(musicInfo);
                x3();
                String str4 = x3().LJLJJI;
                String str5 = x3().LJLJL;
                OX0 ox0 = x3().LJLJLLL;
                for (ExternalMusicInfo externalMusicInfo : LJJIJ) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
                    hashMap.put("music_from", externalMusicInfo.getPartnerName());
                    boolean z = false;
                    if (o.LJ("ttm", externalMusicInfo.getPartnerName())) {
                        if (SVB.LIZ(context)) {
                            str3 = "other_app";
                        } else if (str5 == null || str5.length() == 0) {
                            str3 = "brand_pop_up";
                        } else {
                            str3 = str5;
                        }
                        hashMap.put("show_type", str3);
                        String externalLabel = externalMusicInfo.getExternalLabel();
                        if (externalLabel == null) {
                            externalLabel = "";
                        }
                        hashMap.put("external_label_id", externalLabel);
                    }
                    hashMap.put("process_id", sud.LIZ);
                    if (str4 == null) {
                        str = sud.LIZIZ;
                    } else {
                        str = str4;
                    }
                    hashMap.put("song_id", str);
                    hashMap.put("group_id", sud.LIZJ);
                    hashMap.put("button_name", "play_full_song");
                    if (o.LJ("ttm", externalMusicInfo.getPartnerName()) && (map = sud.LIZLLL) != null) {
                        hashMap.putAll(map);
                    }
                    if (ox0 != null && ox0.isPgc()) {
                        z = true;
                    }
                    if (z) {
                        str2 = "pgc_clip";
                    } else {
                        str2 = "original_song";
                    }
                    hashMap.put("from_music_type", str2);
                    FMX.LJIIL("show_copyright_music", hashMap);
                    SUD.LIZIZ(sud.LIZIZ, LJJIJ);
                }
                return;
            }
            o.LJIJI("fragment");
            throw null;
        }
        o.LJIJI("thirdMusicLogic");
        throw null;
    }
}
