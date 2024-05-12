package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AqS50S0110000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45463Hsp implements InterfaceC45689HwT {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;

    public C45463Hsp(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LJLIL = mvChoosePhotoScene;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // X.InterfaceC45689HwT
    public final void LJIIZILJ(C45678HwI c45678HwI, boolean z, int i, boolean z2) {
        ?? r8;
        SearchCreationExtraData searchCreationExtraData;
        ?? r4;
        String str;
        boolean z3;
        String str2;
        String str3;
        String str4;
        String str5;
        int value;
        String str6;
        boolean z4;
        boolean z5;
        TextView textView;
        int i2 = 0;
        if (c45678HwI != null) {
            H78.LIZIZ("MvChoosePhotoActivity", "onAlbumChooseCallback, model != null");
            this.LJLIL.getClass();
            if ((i & 8) != 0 || (i & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i3 = i & 16;
            if (i3 != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (this.LJLIL.LLLIIIIL != -1 && z4) {
                H78.LIZIZ("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshPhotoList");
                ChooseMediaViewModel chooseMediaViewModel = this.LJLIL.LLLLLIL;
                if (chooseMediaViewModel != null) {
                    ArrayList arrayList = new ArrayList(c45678HwI.LIZIZ);
                    chooseMediaViewModel.setState(new AqS50S0110000_7(z2, arrayList, 5));
                    chooseMediaViewModel.LJLJJLL.clear();
                    chooseMediaViewModel.LJLJJLL.addAll(arrayList);
                    if (chooseMediaViewModel.LJLLJ == 3) {
                        chooseMediaViewModel.Rv0(chooseMediaViewModel.LJLJJLL);
                    }
                }
            }
            if (this.LJLIL.LLLIIII != -1 && i3 != 0) {
                H78.LIZIZ("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshVideoList");
                ChooseMediaViewModel chooseMediaViewModel2 = this.LJLIL.LLLLLIL;
                if (chooseMediaViewModel2 != null) {
                    ArrayList arrayList2 = new ArrayList(c45678HwI.LIZJ);
                    chooseMediaViewModel2.setState(new AqS50S0110000_7(z2, arrayList2, 6));
                    chooseMediaViewModel2.LJLJL.clear();
                    chooseMediaViewModel2.LJLJL.addAll(arrayList2);
                    if (chooseMediaViewModel2.LJLLJ == 2) {
                        chooseMediaViewModel2.Rv0(chooseMediaViewModel2.LJLJL);
                    }
                }
            }
            if (this.LJLIL.LLLII != -1 && z5 && z4) {
                H78.LIZIZ("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshAllList");
                ChooseMediaViewModel chooseMediaViewModel3 = this.LJLIL.LLLLLIL;
                if (chooseMediaViewModel3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < ((ArrayList) c45678HwI.LIZIZ).size() && i5 < ((ArrayList) c45678HwI.LIZJ).size()) {
                        MediaModel mediaModel = (MediaModel) ListProtector.get(c45678HwI.LIZIZ, i4);
                        MediaModel mediaModel2 = (MediaModel) ListProtector.get(c45678HwI.LIZJ, i5);
                        if (mediaModel.date >= mediaModel2.date) {
                            arrayList3.add(mediaModel);
                            i4++;
                        } else {
                            arrayList3.add(mediaModel2);
                            i5++;
                        }
                    }
                    while (i4 < ((ArrayList) c45678HwI.LIZIZ).size()) {
                        arrayList3.add(ListProtector.get(c45678HwI.LIZIZ, i4));
                        i4++;
                    }
                    while (i5 < ((ArrayList) c45678HwI.LIZJ).size()) {
                        arrayList3.add(ListProtector.get(c45678HwI.LIZJ, i5));
                        i5++;
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    if (((Boolean) C45650Hvq.LIZ.getValue()).booleanValue()) {
                        chooseMediaViewModel3.setStateImmediate(new AqS50S0110000_7(z2, arrayList4, 3));
                    } else {
                        chooseMediaViewModel3.setState(new AqS50S0110000_7(z2, arrayList4, 4));
                    }
                    chooseMediaViewModel3.LJLJLJ.clear();
                    chooseMediaViewModel3.LJLJLJ.addAll(arrayList4);
                    if (chooseMediaViewModel3.LJLLJ == 1) {
                        chooseMediaViewModel3.Rv0(chooseMediaViewModel3.LJLJLJ);
                    }
                }
            }
            if (!TextUtils.isEmpty(c45678HwI.LIZ) && (textView = this.LJLIL.LLF) != null) {
                textView.setText(c45678HwI.LIZ);
            }
        } else {
            H78.LIZIZ("MvChoosePhotoActivity", "onAlbumChooseCallback, model == null");
        }
        if (z) {
            this.LJLIL.LLJZIJLIL(false);
            this.LJLIL.LLLJL().LJ();
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (!mvChoosePhotoScene.LLLFZ) {
            mvChoosePhotoScene.LLLFZ = true;
            ShortVideoContext shortVideoContext = mvChoosePhotoScene.LLJLLIL;
            if (shortVideoContext != null) {
                r8 = shortVideoContext.LJJIJ();
            } else {
                r8 = 0;
            }
            Bundle LIZ = C163796bn.LIZ(this.LJLIL);
            HashMap<String, String> hashMap = null;
            if (LIZ != null) {
                searchCreationExtraData = (SearchCreationExtraData) LIZ.getParcelable("extra_search_creation_data");
            } else {
                searchCreationExtraData = null;
            }
            Bundle bundle = this.LJLIL.mArguments;
            if (bundle != null) {
                r4 = bundle.getBoolean("album_tab_is_default_selected", false);
            } else {
                r4 = 0;
            }
            if (o.LJ(this.LJLIL.LLLLLLL, "photo_h5") || o.LJ(this.LJLIL.LLLLLLL, "profile_notice")) {
                if (this.LJLIL.o) {
                    str = "upload_tab";
                } else {
                    str = "direct_land";
                }
            } else {
                str = null;
            }
            ?? c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LJLIL.LLLLLZ.getCreationId());
            String str7 = this.LJLIL.LLLLLLL;
            if (str7 == null || str7.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str8 = "";
            if (z3) {
                ShortVideoContext shortVideoContext2 = this.LJLIL.LLJLLIL;
                if (shortVideoContext2 == null || (str2 = shortVideoContext2.shootWay) == null) {
                    str2 = "";
                }
            } else {
                str2 = this.LJLIL.LLLLLLL;
            }
            c145995oB.LJI("shoot_way", str2);
            c145995oB.LIZ(r8, "is_use_sound_sync");
            String str9 = this.LJLIL.LLLLLLLLL;
            if (str9 == null || str9.length() == 0) {
                str3 = "video_shoot_page";
            } else {
                str3 = this.LJLIL.LLLLLLLLL;
            }
            c145995oB.LJI("enter_from", str3);
            String str10 = this.LJLIL.LLLLLLLLL;
            if (str10 == null || str10.length() == 0) {
                ShortVideoContext shortVideoContext3 = this.LJLIL.LLJLLIL;
                if (shortVideoContext3 == null || (str4 = shortVideoContext3.enterFrom) == null) {
                    str4 = "";
                }
            } else {
                str4 = this.LJLIL.LLLLLLLLL;
            }
            c145995oB.LJI("shoot_enter_from", str4);
            ShortVideoContext shortVideoContext4 = this.LJLIL.LLJLLIL;
            if (shortVideoContext4 != null && (str6 = shortVideoContext4.enterMethod) != null) {
                str8 = str6;
            }
            c145995oB.LJI("shoot_enter_method", str8);
            if (str == null) {
                ShortVideoContext shortVideoContext5 = this.LJLIL.LLJLLIL;
                if (shortVideoContext5 != null) {
                    str = shortVideoContext5.LJIJI();
                } else {
                    str = null;
                }
            }
            c145995oB.LJI("shoot_tab_name", str);
            c145995oB.LJI("upload_tab_name", this.LJLIL.LJLJJLL);
            c145995oB.LIZ(this.LJLIL.LJZ ? 1 : 0, "is_pip");
            c145995oB.LIZ(this.LJLIL.LLLLLZIL() ? 1 : 0, "is_editor_pro");
            c145995oB.LIZ(this.LJLIL.LLLLLZL() ? 1 : 0, "is_replace");
            c145995oB.LIZIZ(System.currentTimeMillis() - this.LJLIL.LLLLLZL, "duration");
            c145995oB.LIZ(this.LJLIL.LLIFFJFJJ ? 1 : 0, "is_upload_direct_enter");
            if (this.LJLIL.LLLLZIL()) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c145995oB.LJI("is_through_library", str5);
            c145995oB.LIZ(this.LJLIL.LLJJI, "is_mv_anchor");
            c145995oB.LJI("mv_id", this.LJLIL.LLJLL);
            if (searchCreationExtraData != null) {
                hashMap = searchCreationExtraData.getMobMap();
            }
            c145995oB.LJFF(hashMap);
            c145995oB.LIZ(r4, "is_landing_by_default");
            if (C78685UuP.LJJJZ(this.LJLIL.LJZI)) {
                EnumC1289754j[] values = EnumC1289754j.values();
                MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        EnumC1289754j enumC1289754j = values[i2];
                        if (o.LJ(enumC1289754j.getType(), mvChoosePhotoScene2.LJZI)) {
                            value = enumC1289754j.getValue();
                            break;
                        }
                        i2++;
                    } else {
                        value = EnumC1289754j.GENERAL.getValue();
                        break;
                    }
                }
                c145995oB.LIZ(value, "ep_anchor_type");
            }
            GXR.LIZ("enter_upload_page", c145995oB.LIZ);
        }
    }
}
