package com.bytedance.android.livesdk.chatroom.network;

import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import webcast.api.room.RoomGoalsResponse;

/* loaded from: classes6.dex */
public interface LiveGoalApi {
    @E8L("/webcast/room/janus_multi/goals/")
    Object getCurrentRoomGoals(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("sec_owner_id") String str, @InterfaceC64986Pew("type") int i, @InterfaceC64986Pew("goal_scene") int i2, @InterfaceC64986Pew("goal_id") long j2, @InterfaceC64986Pew("source") int i3, @InterfaceC64986Pew("recommend_extra") String str2, InterfaceC67352kd<? super C28467BFf<RoomGoalsResponse>> interfaceC67352kd);
}
