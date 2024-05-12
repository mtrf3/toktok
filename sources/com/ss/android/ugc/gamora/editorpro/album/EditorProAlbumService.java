package com.ss.android.ugc.gamora.editorpro.album;

import X.ActivityC45651qj;
import X.AnonymousClass508;
import X.AnonymousClass569;
import X.C124574uj;
import X.C124994vP;
import X.C132805Jc;
import X.C16880lQ;
import X.C44529Hdl;
import X.C45771Hxn;
import X.C52B;
import X.C5HW;
import X.C73994T2g;
import X.C76800UCe;
import X.C77412UZs;
import X.C78915Uy7;
import X.C79057V0z;
import X.EnumC127814zx;
import X.H7C;
import X.H7R;
import X.HZV;
import X.I9T;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class EditorProAlbumService implements IAlbumService {
    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public int getResultCode() {
        return 1024;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public List<EditMedia> parseIntentData(ActivityC45651qj activity, Intent intent, Integer num) {
        ArrayList parcelableArrayListExtra;
        String str;
        boolean z;
        Object obj;
        o.LJIIIZ(activity, "activity");
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty()) {
            return null;
        }
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("library_material_info");
        ArrayList arrayList = new ArrayList();
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLLLLLLLLL().getPath());
            LIZ.append(File.separator);
            LIZ.append(mediaModel.relativePath);
            LIZ.append(mediaModel.fileName);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (mediaModel.libraryState != null) {
                if (parcelableArrayListExtra2 != null) {
                    Iterator it2 = parcelableArrayListExtra2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (o.LJ(((LibraryMaterialInfoSv) obj).getId(), mediaModel.id)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv = (LibraryMaterialInfoSv) obj;
                    if (libraryMaterialInfoSv != null) {
                        str = libraryMaterialInfoSv.getId();
                        AnonymousClass569.LJIIIIZZ.add(libraryMaterialInfoSv);
                        String str2 = mediaModel.fileLocalUriPath;
                        o.LJIIIIZZ(str2, "mediaModel.fileLocalUriPath");
                        if (!mediaModel.LJI() || mediaModel.type == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new EditMedia(str2, z, LIZIZ, str, null, null, 48, null));
                    }
                }
                str = null;
                String str22 = mediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str22, "mediaModel.fileLocalUriPath");
                if (!mediaModel.LJI()) {
                }
                z = true;
                arrayList.add(new EditMedia(str22, z, LIZIZ, str, null, null, 48, null));
            } else {
                String str3 = mediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str3, "mediaModel.fileLocalUriPath");
                arrayList.add(new EditMedia(str3, mediaModel.LJI(), LIZIZ, null, Long.valueOf(mediaModel.startTime), Long.valueOf(mediaModel.endTime), 8, null));
            }
        }
        return arrayList;
    }

    public final void afterAllow(ActivityC45651qj activity, int i, AnonymousClass508 filterData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ArrayList arrayList;
        int LJFF;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(filterData, "filterData");
        EditorProContext.Companion.getClass();
        EditorProContext LIZ = C124994vP.LIZ();
        NLETrack mainTrack = LIZ.getMainTrack();
        if (filterData.LIZIZ == 1) {
            LJFF = 1;
        } else {
            o.LJIIIZ(mainTrack, "<this>");
            if (!C124574uj.LJJL(mainTrack)) {
                arrayList = new ArrayList();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
                while (it.hasNext()) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it.next().LJI());
                    if (LJJ != null) {
                        String LIZJ = LJJ.LIZIZ().LIZJ();
                        o.LJIIIIZZ(LIZJ, "it.resource.resourceFile");
                        linkedHashSet.add(LIZJ);
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            LJFF = C45771Hxn.LJFF() - arrayList.size();
            if (LJFF <= 0) {
                C79057V0z.LJJJJL(LIZ, "is_showing_album_page", Boolean.FALSE);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(C45771Hxn.LIZIZ(activity));
                C78915Uy7.LJJIIZI(activity, 1058, creativeToastBuilder);
                return;
            }
        }
        VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ == null) {
            return;
        }
        Bundle createChooseMediaBundle = createChooseMediaBundle(LIZIZ, mainTrack.getMeasuredEndTime() / 1000, i, LJFF, filterData);
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        HZV.LIZ().LJIILL(activity, createChooseMediaBundle, i, i);
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IAlbumService
    public void startSelectMedia(ActivityC45651qj activity, int i, AnonymousClass508 filterData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(filterData, "filterData");
        if (activity.isFinishing()) {
            H7C.LIZLLL(C5HW.LIZIZ, "album", "startSelectMedia::activity isFinishing", null, 8);
        } else {
            C52B.LIZ(activity, TokenCert.Companion.with((String) C73994T2g.LJIIJ("bpea-tools_request_storage_permission_editor_pro_select_media_target33", "bpea-tools_request_storage_permission_editor_pro_select_media")), null, new AqS7S0401000_2(this, (EditorProAlbumService) activity, (ActivityC45651qj) i, (int) filterData, (AnonymousClass508) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 7), 4);
        }
    }

    private final Bundle createChooseMediaBundle(VideoPublishEditModel videoPublishEditModel, long j, int i, int i2, AnonymousClass508 anonymousClass508) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", 6);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putLong("Key_min_duration", C44529Hdl.LIZIZ());
        bundle.putInt("key_photo_select_max_count", i2);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", i2);
        bundle.putInt("key_video_select_min_count", 1);
        if (anonymousClass508.LIZLLL == EnumC127814zx.REPLACE) {
            bundle.putBoolean("Key_replace_item", true);
            Long l = anonymousClass508.LIZJ;
            if (l != null) {
                bundle.putLong("Key_replace_item_duration", l.longValue());
            }
        }
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putString("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        bundle.putString("content_type", H7R.LJIIIZ(videoPublishEditModel));
        bundle.putString("enter_from", "video_edit_page");
        bundle.putLong("creation_duration", j);
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            bundle.putString("draft_way", "general_draft_list");
        }
        bundle.putInt("key_choose_scene", 14);
        bundle.putInt("key_choose_request_code", i);
        bundle.putBoolean("is_pip", anonymousClass508.LJFF);
        bundle.putBoolean("is_from_editor_pro", true);
        bundle.putString("music_id", I9T.LIZLLL(videoPublishEditModel.creativeModel.musicBuzModel));
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
        C77412UZs.LJJIJLIJ(bundle, creativeInfo);
        bundle.putParcelable("creative_flow_data", videoPublishEditModel.creativeFlowData);
        return bundle;
    }
}
